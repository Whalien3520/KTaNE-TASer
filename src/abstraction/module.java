package abstraction;
public abstract class module {
	//all module constructors must include an edgework class and a bombConfig class
	public edgework edgework;public bombConfig bombconfig;private boolean solved;
	public abstract void input(String s);
	protected void setSolved(){solved=true;System.out.println("Please enter the next module or boss stages");}
	public boolean isSolved(){return solved;}//set solved to be true after printing the last line of the solution
}
