package abstraction;

import javax.swing.JOptionPane;

public class bombConfig 
{
	private int solvables, needies, min, sec;
	public bombConfig()
	{
		String input = JOptionPane.showInputDialog("Enter the number of solvable modules:");
		boolean v = isNum(input);
		while(!(v))
		{
			JOptionPane.showMessageDialog(null, "ERROR");
			input = JOptionPane.showInputDialog("Enter the number of solvable modules:");
			v = isNum(input);
		}
		solvables = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Enter the number of needies:");
		v = isNum(input);
		while(!(v))
		{
			JOptionPane.showMessageDialog(null, "ERROR");
			input = JOptionPane.showInputDialog("Enter the number of needies:");
			v = isNum(input);
		}
		needies = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Enter the amount of time for the bomb:");
		v = validTime(input);
		while(!(v))
		{
			JOptionPane.showMessageDialog(null, "ERROR");
			input = JOptionPane.showInputDialog("Enter the amount of time for the bomb:");
			v = validTime(input);
		}
		String[] temp = input.split(":");
		min = Integer.parseInt(temp[0]);
		sec = Integer.parseInt(temp[1]);
	}
	public int getNumberModules(){return (solvables + needies);}
	public int getNumberSolvables(){return solvables;}
	public int getNumberNeedies(){return needies;}
	public int getStartingMinutes(){return min;}
	public int getStartingSeconds(){return ((min * 60) + sec);}
	private boolean validTime(String i)
	{
		String[] conv = i.split(":");
		if(conv.length == 2)
		{
			if(isNum(conv[1]))
			{
				int temp = Integer.parseInt(conv[1]);
				return (isNum(conv[0]) && temp >= 0 && temp < 60);
			}
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
}
