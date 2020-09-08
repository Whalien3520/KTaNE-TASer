package abstraction;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;
public class edgework {
	int b, bh, ba, bd;
	ArrayList<String> lit = new ArrayList<String>(), unlit = new ArrayList<String>();
	String[][] pp;
	String sn, sndigs, snlets;
	int tf, dom;
	public edgework()
	{
		String input = JOptionPane.showInputDialog("Enter the number of B/BH:");
		boolean v = validBat(input);
		while(!(v))
		{
			JOptionPane.showMessageDialog(null, "ERROR");
			input = JOptionPane.showInputDialog("Enter the number of B/BH:");
			v = validBat(input);
		}
		String[] temp = input.split("/");b = Integer.parseInt(temp[0]); bh = Integer.parseInt(temp[1]);ba = (b - bh) * 2;bd = b - ba;
		input = JOptionPane.showInputDialog("Format: *LIT UNLIT\nEnter the indicators (spaces):").toUpperCase();
		v = validInd(input);
		while(!(v))
		{
			JOptionPane.showMessageDialog(null, "ERROR");
			input = JOptionPane.showInputDialog("Format: *LIT UNLIT\nEnter the indicators (spaces):").toUpperCase();
			v = validInd(input);
		}
		if(input.length() > 0)
		{
			temp = input.split(" ");
			for(int aa = 0; aa < temp.length; aa++)
			{
				if(temp[aa].charAt(0) == '*')
					lit.add(temp[aa].substring(1).toUpperCase());
				else
					unlit.add(temp[aa].toUpperCase());
			}
		}
		input = JOptionPane.showInputDialog("Enter the number of port plates:");
		v = isNum(input);
		while(!(v))
		{
			JOptionPane.showMessageDialog(null, "ERROR");
			input = JOptionPane.showInputDialog("Enter the number of port plates:");
			v = isNum(input);
		}
		pp = new String[Integer.parseInt(input)][];
		if(pp.length > 0)
		{
			ImageIcon i = new ImageIcon("Images/PortList.png");
			JLabel l = new JLabel();
			l.setIcon(i);
			JFrame f = new JFrame();
			f.setLayout(new BorderLayout());
			f.add(l);
			f.pack();
			f.setVisible(true);
			for(int aa = 0; aa < pp.length; aa++)
			{
				input = JOptionPane.showInputDialog("Enter the ports on plate # " + (aa + 1) + " (spaces):").toUpperCase();
				v = validPort(input);
				while(!(v))
				{
					JOptionPane.showMessageDialog(null, "ERROR");
					input = JOptionPane.showInputDialog("Enter the ports on plate # " + (aa + 1) + " (spaces):").toUpperCase();
					v = validPort(input);
				}
				if(input.equals("") || input.equals("EMPTY") || input.equals("0"))
					pp[aa] = new String[0];
				else
					pp[aa] = input.split(" ");
			}
			f.setVisible(false);
		}
		sn = JOptionPane.showInputDialog("Enter the serial number:").toUpperCase();
		v = validSN(sn);
		while(!(v))
		{
			JOptionPane.showMessageDialog(null, "ERROR");
			sn = JOptionPane.showInputDialog("Enter the serial number:").toUpperCase();
			v = validSN(sn);
		}
		sndigs = ""; snlets = "";
		for(int aa = 0; aa < sn.length(); aa++)
		{
			if("0123456789".indexOf(sn.charAt(aa)) < 0)
				snlets = snlets + "" + sn.charAt(aa);
			else
				sndigs = sndigs + "" + sn.charAt(aa);
		}
		input = JOptionPane.showInputDialog("Enter the number of two factors:");
		v = isNum(input);
		while(!(v))
		{
			JOptionPane.showMessageDialog(null, "ERROR");
			input = JOptionPane.showInputDialog("Enter the number of two factors:");
			v = isNum(input);
		}
		tf = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Enter the number of date of manufactures:");
		v = isNum(input);
		while(!(v))
		{
			JOptionPane.showMessageDialog(null, "ERROR");
			input = JOptionPane.showInputDialog("Enter the number of date of manufactures:");
			v = isNum(input);
		}
		dom = Integer.parseInt(input);
	}
	
	public int getBAT(){return b;}
	public int getBH(){return bh;}
	public int getBA(){return ba;}
	public int getBD(){return bd;}
	
	public boolean hasLit(String s){return (lit.contains(s));}
	public boolean hasUnlit(String s){return (unlit.contains(s));}
	public boolean hasInd(String s){return (hasLit(s) || hasUnlit(s));}
	public String getLit() {return lit.toString();}
	public String getUnlit() {return unlit.toString();}
	
	public String[][] getPorts(){return pp;};
	public int findPort(String p) {
		int n = 0;
		for(int aa = 0; aa < pp.length; aa++)
		{
			for(int bb = 0; bb < pp[aa].length; bb++)
			{
				if(pp[aa][bb].equals(p))
					n++;
			}
		}
		return n;
	}
	public int findPorts(String[] p) {
		int n = 0;
		boolean[] b = new boolean[p.length];
		for(int aa = 0; aa < pp.length; aa++)
		{
			for(int bb = 0; bb < b.length; bb++)
				b[bb] = false;
			for(int bb = 0; bb < pp[aa].length; bb++)
			{
				for(int cc = 0; cc < p.length; cc++)
				{
					if(pp[aa][bb].equals(p[cc]))
						b[cc] = true;
				}
			}
			boolean bool = true;
			for(int bb = 0; bb < b.length; bb++)
				bool = bool && b[bb];
			if(bool)
				n++;
		}
		return n;
	}
	public int getNumberPorts()
	{
		int n = 0;
		for(int aa = 0; aa < pp.length; aa++)
			n += pp[aa].length;
		return n;
	}
	public int getEmptyPlates()
	{
		int n = 0;
		for(int aa = 0; aa < pp.length; aa++)
		{
			if(pp[aa].length == 0)
				n++;
		}
		return n;
	}
	public int getNumberPortTypes()
	{
		ArrayList<String> types = new ArrayList<String>();
		for(int aa = 0; aa < pp.length; aa++)
		{
			for(int bb = 0; bb < pp[aa].length; bb++)
			{
				if(!(types.contains(pp[aa][bb])))
					types.add(pp[aa][bb].toUpperCase());
			}
		}
		return types.size();
	}
	public int getNumberUniquePortTypes()
	{
		ArrayList<String> types = new ArrayList<String>();
		ArrayList<String> removed = new ArrayList<String>();
		for(int aa = 0; aa < pp.length; aa++)
		{
			for(int bb = 0; bb < pp[aa].length; bb++)
			{
				if(!(removed.contains(pp[aa][bb])))
				{
					if(types.contains(pp[aa][bb]))
					{
						types.remove(pp[aa][bb].toUpperCase());
						removed.add(pp[aa][bb].toUpperCase());
					}
					else
						types.add(pp[aa][bb].toUpperCase());
				}
			}
		}
		return types.size();
	}
	public int getNumberDuplicatePortTypes()
	{
		ArrayList<String> types = new ArrayList<String>();
		ArrayList<String> removed = new ArrayList<String>();
		for(int aa = 0; aa < pp.length; aa++)
		{
			for(int bb = 0; bb < pp[aa].length; bb++)
			{
				if(!(removed.contains(pp[aa][bb])))
				{
					if(types.contains(pp[aa][bb]))
					{
						types.remove(pp[aa][bb].toUpperCase());
						removed.add(pp[aa][bb].toUpperCase());
					}
					else
						types.add(pp[aa][bb].toUpperCase());
				}
			}
		}
		return removed.size();
	}
	public String getSN(){return sn;}
	public int getNumberSNDigits(){return sndigs.length();}
	public int getNumberSNLetters(){return snlets.length();}
	public int getSNDigit(int pos) {return Character.getNumericValue(sndigs.charAt(pos));}
	public char getSNLetter(int pos){return snlets.charAt(pos);}
	public char getSNCharacter(int pos){return sn.charAt(pos);}
	public int getNumberSNCharacters(String i)
	{
		int n = 0;
		for(int aa = 0; aa < sn.length(); aa++)
		{
			if(i.indexOf(sn.charAt(aa)) >= 0)
				n++;
		}
		return n;
	}
	
	
	private boolean validBat(String i)
	{
		String[] conv = i.split("/");
		if(conv.length == 2)
		{
			if(isNum(conv[0]) && isNum(conv[1]))
			{
				int bat = Integer.parseInt(conv[0]), bh = Integer.parseInt(conv[1]);
				if(bat > 0 && bh == 0)
					return false;
				if(bat < bh)
					return false;
				return true;
			}
		}
		return false;
	}
	private boolean validInd(String i)
	{
		if(i.length() == 0)
			return true;
		String[] conv = i.split(" ");
		for(int aa = 0; aa < conv.length; aa++)
		{
			if(conv[aa].charAt(0) == '*')
				conv[aa] = conv[aa].substring(1);
			if(conv[aa].length() != 3)
				return false;
		}		
		return true;
	}
	private boolean validPort(String i)
	{
		if(i.equals("") || i.equals("0") || i.equals("empty"))
			return true;
		String[] conv = i.split(" ");
		for(int aa = 0; aa < conv.length; aa++)
		{
			switch(conv[aa])
			{
				case "PARALLEL":
				case "SERIAL":
				case "DVI-D":
				case "RJ-45":
				case "PS/2":
				case "RCA":
				case "AC":
				case "COMPONENT":
				case "HDMI":
				case "COMPOSITE":
				case "VGA":
				case "USB":
				case "PCMCIA":
					break;
				default:
					return false;
			}
		}
		return true;
	}
	private boolean validSN(String i)
	{
		if(i.length() == 6)
		{
			String[] checker = {"0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ", "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ", "0123456789", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "0123456789"};
			for(int aa = 0; aa < 6; aa++)
			{
				if(checker[aa].indexOf(i.charAt(aa)) < 0)
					return false;
			}
			return true;
		}
		return false;
	}
	private boolean isNum(String i)
	{
		if(i.length() == 0)
			return false;
		for(int aa = 0; aa < i.length(); aa++)
		{
			if("0123456789".indexOf(i.charAt(aa)) < 0)
				return false;
		}
		return true;
	}
	public void printEW()
	{
		System.out.println("BAT/BH: " + b + "/" + bh);
		System.out.println("BA: " + ba);
		System.out.println("BD: " + bd);
		System.out.println("LIT: " + lit.toString());
		System.out.print("UNLIT: " + unlit.toString());
		for(int aa = 0; aa < pp.length; aa++)
		{
			System.out.print("\nPORT PLATE #" + (aa + 1) + ": ");
			for(int bb = 0; bb < pp[aa].length; bb++)
				System.out.print(pp[aa][bb] + " ");
		}
		System.out.println("\nSERIAL NUMBER: " + sn);
		System.out.println("# OF TWO FACTORS: " + tf);
		System.out.println("# OF DATE OF MANUFACTURES: " + dom);
		
	}
}