package missionControl;
import java.util.ArrayList;
import abstraction.*;
import modules.*;
public class gameState {bombConfig b;edgework e;ArrayList<String> souvNotes;module current;bossModuleManager bossManager;
	public gameState()
	{
		b = new bombConfig();
		e = new edgework();
		e.printEW();
		System.out.println("Please enter the first module");
	}
	public void bossModules(String s){/*String[]r=s.split(",");for(int i=0;i<r.length;i++);*/}/*incomplete*/
	public void input(String s) {
		/*if(bossManager.needInput()){}
		else*/ if(current!=null) {
			if(current.isSolved()){current=null;identifyModule(s);}
			else current.input(s);
		}
		else identifyModule(s);
	}
	public void identifyModule(String s){
		if(s.equalsIgnoreCase("Simon Stores"))current=new simonStores(b,e);
		if(s.equalsIgnoreCase("Black Hole"))current=new blackHole(b,e);}
}
