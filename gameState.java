package missionControl;
import java.util.ArrayList;
import abstraction.*;
public class gameState {bombConfig b;edgework e;ArrayList<String> souvNotes;module current;bossModuleManager bossManager;
	public gameState(String s){b=new bombConfig(s.split(" "));System.out.println("Please enter edgework.");}
	public void edgework(String[] s){e=new edgework(s);System.out.println("Please enter boss modules.");}//*boss modules to be implemented later
	public void bossModules(String s){/*String[]r=s.split(",");for(int i=0;i<r.length;i++);*/}/*incomplete*/
	public void input(String s) {
		if(bossManager.needInput()){}
		else if (current!=null)current.input(s);
		else identifyModule(s);
	}
	public void identifyModule(String s) {}
}
