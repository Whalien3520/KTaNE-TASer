package abstraction;
import java.util.ArrayList;
public class edgework {
	int b,bh;ArrayList<String> i,pp=new ArrayList<String>();String sn;
	public edgework(String s){String[] t=s.split(" ");
	b=Integer.parseInt(t[0].split("in")[0]);bh=Integer.parseInt(t[0].split("in")[1]);
	int n=1;while(n<t.length-1 && t[n].charAt(0)!=91){i.add(t[n]);n++;}
	while(n<t.length-1)pp.add(t[n]);
	sn=t[t.length-1];}
	public boolean hasInd(String s){for(String t:i)if(s.equals(t))return true;return false;}
	public String serialNumber(){return sn;}
	public int litCount(){int j=0;for(String t:i)if(t.length()==4)j++;return j;}
	public int unlitCount(){int j=0;for(String t:i)if(t.length()==3)j++;return j;}
	public boolean hasPort(String s){for(String t:pp)if(t.contains(s))return true;return false;}
	public int snDigCount(){int n=0;for(int j=0;j<sn.length();j++)if(sn.charAt(j)<58)n++;return n;}
}
