package abstraction;

public abstract class bossModule extends module{
	private String name;
	protected void setName(String s){name=s;}
	public String name() {return name;}
	public abstract void output();
}
