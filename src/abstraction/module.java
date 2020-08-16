package abstraction;
public abstract class module {
	//all module constructors must include an edgework class and a bombConfig class
	public edgework edgework;public bombConfig bombconfig;public boolean solved;
	public abstract void input(String s);
	public boolean isSolved(){return solved;}//set solved to be true after printing the last line of the solution
}
