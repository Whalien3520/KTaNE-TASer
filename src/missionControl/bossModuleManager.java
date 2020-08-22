package missionControl;
import abstraction.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class bossModuleManager {
	private ArrayList<bossModule> bossMods;private edgework e;private bombConfig b;
	public bossModuleManager(bombConfig bc, edgework ed) {e=ed;b=bc;
	String input = JOptionPane.showInputDialog("Enter boss modules, separated by commas.");
	}
	public boolean needInput() {return false;}
}
