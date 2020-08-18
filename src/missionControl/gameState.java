package missionControl;
import java.util.ArrayList;
import abstraction.*;
public class gameState {bombConfig b;edgework e;ArrayList<String> souvNotes;module current;bossModuleManager bossManager;
	public gameState()
	{
		b = new bombConfig();
		e = new edgework();
		e.printEW();
	}
	public void bossModules(String s){/*String[]r=s.split(",");for(int i=0;i<r.length;i++);*/}/*incomplete*/
	public void input(String s) {
		if(bossManager.needInput()){}
		else if (current!=null)current.input(s);
		else identifyModule(s);
	}
	public void identifyModule(String s) {}
}
