package abstraction;

public abstract class bossModule extends module{
	int d;
	public bossModule(int i, int s){d=i;}
	abstract String name();
	abstract void stage(String s);
	abstract String output();
}
