package bossModules;

import abstraction.*;
public class forgetMeNot extends bossModule{
	int[][]r;int index;
	public forgetMeNot(bombConfig b, edgework e, String n) {
		setBombConfig(b);setEdgework(e);setName(n);r=new int[3][b.getNumberSolvables()];
	}
	public boolean input(String s) {if(!valid(s))return false;r[0][index++]=Integer.parseInt(s);return true;}
	public void output() {
		if(e.hasUnlit("CAR"))r[1][0]=2;
		else if(e.getNumberLit()<e.getNumberUnlit())r[1][0]=7;
		else if(e.getNumberUnlit()==0)r[1][0]=e.getNumberLit();
		else r[1][0]=e.getSNDigit(e.getNumberSNDigits()-1);
		r[2][0]=(r[0][0]+r[1][0])%10;
		if(r[1].length>1) {
			if(e.findPort("SERIAL")>0)r[1][1]=3;
			else if(r[2][0]%2==0)r[1][1]=r[2][0]+1;
			else r[1][1]=r[2][0]-1;}
		r[2][1]=(r[0][1]+r[1][1])%10;
		for(int i=2;i<r[0].length;i++) {
			if(r[2][i-2]==0||r[2][i-1]==0) {
				int t=-1;
				for(int p=0;p<6;p++)
					if(e.getSNCharacter(p)<65&&e.getSNCharacter(p)-48>t)t=e.getSNCharacter(p)-48;
				r[1][i]=t;
			}
			else if(r[2][i-2]%2==0&&r[2][i-1]%2==0) {
				int t=9;
				for(int p=0;p<6;p++)
					if(e.getSNCharacter(p)<65&&e.getSNCharacter(p)-48<t&&(e.getSNCharacter(p)-48)%2==1)t=e.getSNCharacter(p)-48;
				r[1][i]=t;
			}
			else {int o=r[2][i-2]+r[2][i-1];if(o>9)r[1][i]=o/10;else r[1][i]=o;}
			r[2][i]=(r[0][i]+r[1][i])%10;
		}
		for(int t:r[2])System.out.print(t);
	}
	public boolean valid(String s) {
		try {Integer.parseInt(s);}catch(NumberFormatException e){return false;}
		return s.length()==1;
	}
}
