package modules;
import abstraction.*;
import java.util.TreeMap;
public class simonSays extends module{
	char[]f;int i;TreeMap<Character,Character>c=new TreeMap<Character,Character>();
	public simonSays(bombConfig b,edgework e){setEdgework(e);setBombConfig(b);f=new char[5];System.out.print("Please enter the first flash as a letter: ");
	if(e.getSN().contains("A")||e.getSN().contains("E")||e.getSN().contains("I")||e.getSN().contains("O")||e.getSN().contains("U")){
	c.put('R','B');c.put('B','R');c.put('G','Y');c.put('Y','G');}
	else{c.put('R','B');c.put('B','Y');c.put('G','G');c.put('Y','R');}}
	public boolean input(String s){if(!valid(s)){System.out.println("Please enter a valid flash, or just press enter if the module is solved: ");return false;}
	f[i++]=c.get(s.charAt(0));System.out.print("Please press ");for(int j=0;j<i;j++)System.out.print(f[j]);
	System.out.println("\nPlease enter the next flash, or just press enter if the module is solved: ");return true;}
	protected boolean valid(String s) {return s.equals("R")||s.equals("G")||s.equals("B")||s.equals("Y")||s.equals("");
	}
}
