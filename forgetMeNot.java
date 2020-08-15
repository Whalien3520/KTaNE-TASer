package bossMods;
import abstraction.*;
public class forgetMeNot extends bossModule{
	private int cs;/*current stage*/private int[] d,t,c;int z,e; /*display,table,calculated,zero,evens*/
	public forgetMeNot(int i,int s,edgework g) {super(i,s);d=new int[s];t=new int[s];c=new int[s];cs=0;
	if(g.hasInd("CAR"))t[0]=2;
	else if(g.unlitCount()>g.litCount())t[0]=7;
	else if(g.unlitCount()==0)t[0]=g.litCount();
	else t[0]=Integer.parseInt(g.serialNumber().substring(5,6));
	if(g.hasPort("ser")&&g.snDigCount()>2)t[1]=3;
	for(int j=0;j<g.serialNumber().length();j++){if (g.serialNumber().charAt(j)>58) {
		if(g.serialNumber().charAt(j)%26!=0)e=Integer.parseInt(g.serialNumber().substring(j,j+1));
			
			}
		}
	}
	public String name(){return String.format("Forget Me Not #%d", d);}
	public void stage(String s){d[cs]=Integer.parseInt(s);}
}
