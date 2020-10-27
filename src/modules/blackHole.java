package modules;
import abstraction.*;
public class blackHole extends module{
	private int[][]t={{3,1,3,4,1,4,2,2,0,0},{4,3,2,0,2,0,1,4,1,3},{1,0,4,0,1,2,3,4,3,2},{0,2,2,1,3,3,1,0,4,4},{2,4,1,3,0,4,3,0,2,1},{3,1,3,4,0,1,0,2,2,4},{1,2,0,2,4,3,4,1,0,3},{2,3,0,2,3,0,4,1,4,1},{0,4,1,1,4,2,0,3,3,2},{4,0,4,3,2,1,2,3,1,0}};
	private int[]c=new int[4];
	public blackHole(bombConfig b, edgework e) {setBombConfig(b);setEdgework(e);
		c[0]=e.getSNCharacter(2)-48;c[1]=e.getSNCharacter(5)-48;c[2]=e.getNumberPorts();
		System.out.print("Please enter number of digits to input: ");
	}
	public boolean input(String s){
		if(!valid(s)){System.out.print("Please enter a valid number: ");return false;}
		for (int i=0;i<Integer.parseInt(s);i++){
			c[3]=t[c[0]][c[1]];
			switch (c[2]%8){
			case 0:
				for(int j=0;j<i;j++){c[1]--;if(c[1]<0)c[1]=9;
					c[3]+=t[c[0]][c[1]];
				}c[1]--;if(c[1]<0)c[1]=9;break;
			case 1:
				for(int j=0;j<i;j++){c[1]--;c[0]++;if(c[1]<0)c[1]=9;if(c[0]>9)c[0]=0;
					c[3]+=t[c[0]][c[1]];
				}c[1]--;c[0]++;if(c[1]<0)c[1]=9;if(c[0]>9)c[0]=0;break;
			case 2:
				for(int j=0;j<i;j++){c[0]++;if(c[0]>9)c[0]=0;
					c[3]+=t[c[0]][c[1]];
				}c[0]++;if(c[0]>9)c[0]=0;break;
			case 3:
				for(int j=0;j<i;j++){c[1]++;c[0]++;if(c[1]>9)c[1]=0;if(c[0]>9)c[0]=0;
					c[3]+=t[c[0]][c[1]];
				}c[1]++;c[0]++;if(c[1]>9)c[1]=0;if(c[0]>9)c[0]=0;break;
			case 4:
				for(int j=0;j<i;j++){c[1]++;if(c[1]>9)c[1]=0;
					c[3]+=t[c[0]][c[1]];
				}c[1]++;if(c[1]>9)c[1]=0;break;
			case 5:
				for(int j=0;j<i;j++){c[1]++;c[0]--;if(c[1]>9)c[1]=0;if(c[0]<0)c[0]=9;
					c[3]+=t[c[0]][c[1]];
				}c[1]++;c[0]--;if(c[1]>9)c[1]=0;if(c[0]<0)c[0]=9;break;
			case 6:
				for(int j=0;j<i;j++){c[0]--;if(c[0]<0)c[0]=9;
					c[3]+=t[c[0]][c[1]];
				}c[0]--;if(c[0]<0)c[0]=9;break;
			case 7:
				for(int j=0;j<i;j++){c[1]--;c[0]--;if(c[1]<0)c[1]=9;if(c[0]<0)c[0]=9;
					c[3]+=t[c[0]][c[1]];
				}c[1]--;c[0]--;if(c[1]<0)c[1]=9;if(c[0]<0)c[0]=9;break;
			}
			System.out.print(c[3]%5);c[2]++;}System.out.println();setSolved();return true;}
	protected boolean valid(String s){
		try {Integer.parseInt(s);return true;}
		catch(final NumberFormatException e) {return false;}}}