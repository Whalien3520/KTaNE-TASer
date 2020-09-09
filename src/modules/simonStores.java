package modules;
import abstraction.*;
public class simonStores extends module{
	private int D;private int[]a,b,c;private final String p="RGB",s="YCM";private final String h="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final String[][]l={{"R","G","B","C","M","Y"},{"Y","B","G","M","C","R"},{"B","M","R","Y","G","C"}}; private String[]f;private boolean rotated;
	public simonStores(bombConfig bombconfig, edgework edgework){setBombConfig(bombconfig);setEdgework(edgework);String x=edgework.getSN();
	a=new int[6];b=new int[6];c=new int[6];f=new String[5];for(int i=0;i<5;i++)f[i]="";
	D=0;for (int i=0;i<6;i++)D+=h.indexOf(x.substring(i,i+1));D=D%365;
	for(int i=1;i<a.length;i++)a[i]=-366;for(int i=1;i<b.length;i++)b[i]=-366;for(int i=1;i<c.length;i++)c[i]=-366;
	a[0]=(h.indexOf(x.substring(2,3))*36+h.indexOf(x.substring(3,4)))%365;a[4]=0;a[5]=0;
	b[0]=(h.indexOf(x.substring(4,5))*36+h.indexOf(x.substring(5)))%365;b[5]=0;
	c[0]=(h.indexOf(x.substring(0,1))*36+h.indexOf(x.substring(1,2)))%365;
	System.out.println("Please enter button colors starting from NE going clockwise, no spaces.");}
	/*public simonStores(String[]x){a=new int[6];b=new int[6];c=new int[6];f=new String[5];for(int i=0;i<5;i++)f[i]="";
		D=0;for (int i=0;i<6;i++)D+=h.indexOf(x[0].substring(i,i+1));D=D%365;
		a[0]=(h.indexOf(x[0].substring(2,3))*36+h.indexOf(x[0].substring(3,4)))%365;a[4]=0;a[5]=0;
		b[0]=(h.indexOf(x[0].substring(4,5))*36+h.indexOf(x[0].substring(5)))%365;b[5]=0;
		c[0]=(h.indexOf(x[0].substring(0,1))*36+h.indexOf(x[0].substring(1,2)))%365;l(x[1]);}*/
	public void input(String s){
		if(!rotated){l(s);rotated=true;System.out.println("Please enter first stage, with each set of flashes separated by a space.");return;}
		if(f[0].equals("")){f[0]=s.split(" ")[0];f[1]=s.split(" ")[1];f[2]=s.split(" ")[2];
			for(int i=1;i<4;i++) {
				switch(f[i-1].length()){
				case 1:a[i]=o(a[i-1],i,"a",f[i-1]);break;
				case 2:a[i]=t(i,"a",f[i-1]);break;
				case 3:a[i]=h(i,"a",f[i-1]);}}}
		else if(f[3].equals("")){f[3]=s;
			for(int i=1;i<5;i++){
				switch(f[i-1].length()){
				case 1:b[i]=o(b[i-1],i,"b",f[i-1]);break;
				case 2:b[i]=t(i,"b",f[i-1]);break;
				case 3:b[i]=h(i,"b",f[i-1]);}}}
		else{f[4]=s;
			for(int i=1;i<6;i++){
				switch(f[i-1].length()){
				case 1:c[i]=o(c[i-1],i,"c",f[i-1]);break;
				case 2:c[i]=t(i,"c",f[i-1]);break;
				case 3:c[i]=h(i,"c",f[i-1]);}}}
		System.out.println(press());}
	private String press(){
		String ret="";
		if(b[4]==-366){String t=b(a[3]);
		System.out.println("Please enter the fourth flash");
			for(int i=0;i<6;i++){
				if(t.charAt(i)=='-')ret=ret+"K"+l[0][i];
				else if(t.charAt(i)=='+')ret=ret+"W"+l[0][i];}}
		else if(c[5]==-366){String t=b(b[4]);
		System.out.println("Please enter the fifth flash");
			for(int i=0;i<6;i++){
				if(t.charAt(i)=='-')ret=ret+"K"+l[1][i];
				else if(t.charAt(i)=='+')ret=ret+"W"+l[1][i];}}
		else{String t=b(c[5]);
		setSolved();
			for(int i=0;i<6;i++){
				if(t.charAt(i)=='-')ret=ret+"K"+l[2][i];
				else if(t.charAt(i)=='+')ret=ret+"W"+l[2][i];}}
		return ret;
	}
	private String b(int x){
		int t=Math.abs(x);
		if(x==0)
			return "000000";
		String ret="000000";
		for(int i=5;i>=0;i--)
			if(t/(int)Math.pow(3,i)>0) {ret=ret.substring(0,i)+t/(int)Math.pow(3,i)+ret.substring(i+1);t=t%(int)Math.pow(3,i);}
		for(int i=0;i<5;i++)
			switch(ret.charAt(i)){
			case'2':switch(ret.charAt(i+1)) {
			case'-':ret=ret.substring(0,i)+"-0"+ret.substring(i+2);break;
			case'0':ret=ret.substring(0,i)+"-1"+ret.substring(i+2);break;
			case'1':ret=ret.substring(0,i)+"-2"+ret.substring(i+2);break;
			case'2':ret=ret.substring(0,i)+"-3"+ret.substring(i+2);}break;
			case'3':switch(ret.charAt(i+1)) {
			case'-':ret=ret.substring(0,i)+"00"+ret.substring(i+2);break;
			case'0':ret=ret.substring(0,i)+"01"+ret.substring(i+2);break;
			case'1':ret=ret.substring(0,i)+"02"+ret.substring(i+2);break;
			case'2':ret=ret.substring(0,i)+"03"+ret.substring(i+2);}}
		for(int i=0;i<6;i++)if(ret.charAt(i)=='1')ret=ret.substring(0,i)+"+"+ret.substring(i+1);
		if(x<0){
			for(int i=0;i<6;i++) {
				if(ret.charAt(i)=='-')ret=ret.substring(0,i)+"+"+ret.substring(i+1);
				else if(ret.charAt(i)=='+')ret=ret.substring(0,i)+"-"+ret.substring(i+1);}}
		return ret;
	}
	private int o(int x,int n,String t,String o){
		switch(t){
		case"a":switch(o){
		case"R":return(x+D)%365;
		case"G":return(x-D)%365;
		case"B":return(2*x-D)%365;
		case"C":return(D-x-8*n)%365;
		case"M":return(3*(int)Math.pow(n,3)-2*x)%365;
		case"Y":return(x+D-6*n)%365;}
		case"b":switch(o){
		case"R":return(x+a[n-1]+(int)Math.pow(n,2))%365;
		case"G":return(2*x-a[n-1])%365;
		case"B":return(2*x-a[0]-4*(int)Math.pow(n,2))%365;
		case"C":return(x+a[1])%365;
		case"M":return(x+a[2]-D)%365;
		case"Y":return(x+a[3]-a[n-1])%365;}
		case"c":switch(o){
		case"R":return(x+b[n-1]-a[n-1])%365;
		case"G":return(x-2*b[n-1])%365;
		case"B":return(x+b[0]-a[3])%365;
		case"C":return(x-b[n-1]+a[n-1])%365;
		case"M":return(x-2*a[n-1])%365;
		case"Y":return(x+b[4]-a[0])%365;}}
		return -366;}
	private int t(int n,String t,String o){
		switch(t){
		case"a":int d=o(a[n-1],n,t,o.substring(0,1));int e=o(a[n-1],n,t,o.substring(1));
		if(p.contains(o.substring(0,1))!=p.contains(o.substring(1)))return(d+e-2*D)%365;
		if(p.contains(o.substring(0,1)))return Math.max(d,e);return Math.min(d,e);
		case"b":int f=o(b[n-1],n,t,o.substring(0,1));int g=o(b[n-1],n,t,o.substring(1));
		if(p.contains(o.substring(0,1))!=p.contains(o.substring(1)))return(4*D-Math.abs(f-g)%365)%365;
		if(p.contains(o.substring(0,1)))return(Math.abs(f-g))%365;return Math.max(o(b[n-1],n,t,r(o)),o(a[n-1],n,t,r(o)));
		case"c":int h=o(c[n-1],n,t,o.substring(0,1));int i=o(c[n-1],n,t,o.substring(1,2));
		if(p.contains(o.substring(0,1))!=p.contains(o.substring(1)))return Math.min(Math.min(h,i),-(Math.abs(h-i)%365));
		if(p.contains(o.substring(0,1)))return (o(a[n-1],n,t,r(o))+o(b[n-1],n,t,r(o))+o(c[n-1],n,t,r(o)))%365;
		return (o(c[n-1],n,t,r(o))-h-i)%365;}
		return -366;}
	private int h(int n,String t,String o){
		int i=i(o);
		switch(t){
		case"a":switch(i){
		case 111:return (a[n-1]+a[0])%365;
		case 110:return Math.max(Math.max(o(a[n-1],n,t,o.substring(0,1)),o(a[n-1],n,t,o.substring(1,2))),o(a[n-1],n,t,o.substring(2)));
		case 101:return Math.max(Math.max(o(a[n-1],n,t,o.substring(0,1)),o(a[n-1],n,t,o.substring(2))),o(a[n-1],n,t,o.substring(1,2)));
		case 100:return Math.min(Math.min(o(a[n-1],n,t,o.substring(1,2)),o(a[n-1],n,t,o.substring(2))),o(a[n-1],n,t,o.substring(0,1)));
		case 011:return Math.max(Math.max(o(a[n-1],n,t,o.substring(1,2)),o(a[n-1],n,t,o.substring(2))),o(a[n-1],n,t,o.substring(0,1)));
		case 010:return Math.min(Math.min(o(a[n-1],n,t,o.substring(0,1)),o(a[n-1],n,t,o.substring(2))),o(a[n-1],n,t,o.substring(0,1)));
		case 001:return Math.min(Math.min(o(a[n-1],n,t,o.substring(0,1)),o(a[n-1],n,t,o.substring(1,2))),o(a[n-1],n,t,o.substring(2)));
		case 000:return (a[n-1]-a[0])%365;}
		case"b":switch(i){
		case 111:return(b[n-1]+(b[n-1]%4)*b[0]-a[3])%365;
		case 110:return(b[n-1]+o(b[n-1],n,t,o.substring(0,1))+o(b[n-1],n,t,o.substring(1,2))-o(a[n-1],n,t,o.substring(2)))%365;
		case 101:return(b[n-1]+o(b[n-1],n,t,o.substring(0,1))+o(b[n-1],n,t,o.substring(2))-o(a[n-1],n,t,o.substring(1,2)))%365;
		case 100:return(b[n-1]+o(a[n-1],n,t,o.substring(1,2))+o(a[n-1],n,t,o.substring(2))-o(b[n-1],n,t,o.substring(0,1)));
		case 011:return(b[n-1]+o(b[n-1],n,t,o.substring(1,2))+o(b[n-1],n,t,o.substring(2))-o(a[n-1],n,t,o.substring(0,1)))%365;
		case 010:return(b[n-1]+o(a[n-1],n,t,o.substring(1,2))+o(a[n-1],n,t,o.substring(2))-o(b[n-1],n,t,o.substring(0,1)));
		case 001:return(b[n-1]+o(a[n-1],n,t,o.substring(1,2))+o(a[n-1],n,t,o.substring(2))-o(b[n-1],n,t,o.substring(0,1)));
		case 000:return(b[n-1]+(b[0]%4)*b[n-1]-a[3])%365;}
		case"c":switch(i){
		case 111:return(c[n-1]+(c[n-1]%3)*c[0]-(b[n-1]%3)*b[0]+(a[n-1]%3)*a[0])%365;
		case 110:return(o(c[n-1],n,t,o.substring(0,1))+o(c[n-1],n,t,o.substring(1,2))-o(b[n-1],n,t,o.substring(2))-o(a[n-1],n,t,o.substring(2)))%365;
		case 101:return(o(c[n-1],n,t,o.substring(0,1))+o(c[n-1],n,t,o.substring(2))-o(b[n-1],n,t,o.substring(1,2))-o(a[n-1],n,t,o.substring(1,2)))%365;
		case 100:return(o(c[n-1],n,t,o.substring(1,2))+o(c[n-1],n,t,o.substring(2))-o(b[n-1],n,t,o.substring(0,1))-o(a[n-1],n,t,o.substring(0,1)))%365;
		case 011:return(o(c[n-1],n,t,o.substring(1,2))+o(c[n-1],n,t,o.substring(2))-o(b[n-1],n,t,o.substring(0,1))-o(a[n-1],n,t,o.substring(0,1)))%365;
		case 010:return(o(c[n-1],n,t,o.substring(0,1))+o(c[n-1],n,t,o.substring(2))-o(b[n-1],n,t,o.substring(1,2))-o(a[n-1],n,t,o.substring(1,2)))%365;
		case 001:return(o(c[n-1],n,t,o.substring(0,1))+o(c[n-1],n,t,o.substring(1,2))-o(b[n-1],n,t,o.substring(2))-o(a[n-1],n,t,o.substring(2)))%365;
		case 000:return(c[n-1]+(c[0]%3)*c[n-1]-(b[0]%3)*b[n-1]+(a[0]%3)*a[n-1])%365;}}
		return -366;}
	private int i(String o){
		if(p.contains(o.substring(0,1))){
			if(p.contains(o.substring(1,2))){
				if(p.contains(o.substring(2)))return 111;
				return 110;}
			if(p.contains(o.substring(2)))return 101;
			return 100;}
		if(p.contains(o.substring(1,2))){
			if(p.contains(o.substring(2)))return 011;
			return 010;}
		if(p.contains(o.substring(2)))return 001;
		return 000;}
	private String r(String x){
		if(x.contains("R")&&x.contains("G"))return"B";
		if(x.contains("R")&&x.contains("B"))return"G";
		if(x.contains("G")&&x.contains("B"))return"R";
		if(x.contains("C")&&x.contains("M"))return"Y";
		if(x.contains("C")&&x.contains("Y"))return"M";
		return "C";}
	private void l(String x){
		if (x.substring(0,1).equals("Y")){String[]temp={l[0][5],l[1][5],l[2][5]};
			for(int i=5; i>0;i--)for(int j=0;j<3;j++)l[j][i]=l[j][i-1];
			for(int i=0;i<3;i++)l[i][0]=temp[i];}
		if(Math.abs((x.indexOf("R")-x.indexOf("C")))==4){
			for(int i=0;i<3;i++){for(int j=0;j<6;j++){
					switch(l[i][j]){
					case "R":l[i][j]="C";break;
					case "C":l[i][j]="R";break;
					case "G":l[i][j]="M";break;
					case "M":l[i][j]="G";break;
					case "B":l[i][j]="Y";break;
					case "Y":l[i][j]="B";break;}}}}
		if(x.indexOf("G")==0||x.indexOf("G")==6){String[]t={"R","G","B"};cycle(t,l);}
		if(x.indexOf("M")==2||x.indexOf("M")==4){String[] t= {"C","M","Y"};cycle(t,l);}
		if(x.indexOf("B")>3==x.indexOf("Y")>3){for(int i=0;i<3;i++){for(int j=0;j<6;j++){if (l[i][j].equals("B")){l[i][j]=l[i][5-j];l[i][5-j]="B";break;}}}}
		if(x.indexOf("R")<3){String[]t= {"R","Y"};cycle(t,l);}
		if(x.indexOf("B")>2) {String[]t={"G","C"};cycle(t,l);}}
	private static void cycle(String[]r,String[][]c){for (int i = 0; i < 3;i++){
		for(int j=0;j<6;j++){for(int a=0;a<r.length;a++){
					if(c[i][j].equals(r[a])){c[i][j]=r[(a+1)%r.length];break;}}}}}}