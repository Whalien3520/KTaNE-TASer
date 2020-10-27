package missionControl;
import java.util.ArrayList;
import abstraction.*;
import modules.*;
public class gameState {bombConfig b;edgework e;ArrayList<String> souvNotes;module current;bossModuleManager bossManager;
	public gameState()
	{
		b = new bombConfig();
		e = new edgework();
		bossManager=new bossModuleManager(b,e);
		e.printEW();
		System.out.println("Please enter the first module");
	}
	public void bossModules(String s){/*String[]r=s.split(",");for(int i=0;i<r.length;i++);*/}/*incomplete*/
	public void input(String s) {
		if(s.equals("bossInput"))bossManager.input();
		else if(s.equals("Turn The Keys"))System.out.println("Please solve all Morse Code, Wires, Two Bits, The Button, Colour Flash, and Round Keypad modules,/n"
				+"while avoiding all Semaphore, Combination Lock, Simon Says, Astrology, Switches, and Plumbing modules,/n" 
				+"then turn all right-side keys in descending number order./n"
				+"Then, please solve all Password, Who's On First, Crazy Talk, Keypad, Listening, and Orientation modules,/n"
				+"while avoiding all Maze, Memory, Comlicated Wires, Wire Sequence, and Cryptography modules,/n"
				+"then turn all left-side keys in ascending number order.");
		else if(s.equals("bossOutput"))bossManager.output();
		else if(current!=null) {
			if(current.isSolved()){identifyModule(s);}
			else current.input(s);
		}
		else identifyModule(s);
	}
	public void identifyModule(String s){
		if(s.equalsIgnoreCase("Simon Stores"))current=new simonStores(b,e);
		if(s.equalsIgnoreCase("Black Hole"))current=new blackHole(b,e);
		if(s.equalsIgnoreCase("Simon Says"))current=new simonSays(b,e);}
}
