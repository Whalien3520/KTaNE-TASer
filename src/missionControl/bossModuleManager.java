package missionControl;
import abstraction.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import bossModules.*;
public class bossModuleManager {
	private ArrayList<bossModule> bossMods;private edgework e;private bombConfig b;
	public bossModuleManager(bombConfig bc, edgework ed) {e=ed;b=bc;bossMods=new ArrayList<bossModule>();
		String input = JOptionPane.showInputDialog("Enter the name of the first boss module");
		while(!input.equals("")) {
			switch(input) {
			case "Forget Me Not":int t=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of Forget Me Nots"));for(int i=0;i<t;i++){bossMods.add(makeFMN(i+1));
				bossMods.get(bossMods.size()-1).input(JOptionPane.showInputDialog("Enter the first digit for "+bossMods.get(bossMods.size()-1).name()));}break;
			default:JOptionPane.showMessageDialog(null,"Invalid boss module name");
			}
			input = JOptionPane.showInputDialog("Enter the name of the next boss module");
		}
	}
	private forgetMeNot makeFMN(int i) {return new forgetMeNot(b,e,String.format("Forget Me Not #%d",i));}
	public void input() {for(int i=0;i<bossMods.size();i++)if(!bossMods.get(i).input(JOptionPane.showInputDialog("Enter stage for "+bossMods.get(i).name())))i--;}
	public void output() {for(bossModule b:bossMods)b.output();}
}
