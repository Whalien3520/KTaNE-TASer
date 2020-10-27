package abstraction;
public abstract class module {
	//all module constructors must include an edgework class and a bombConfig class
	protected edgework e;protected bombConfig b;private boolean solved;
	public abstract boolean input(String s);
	protected void setSolved(){solved=true;System.out.println("Please enter the next module or boss stages");}
	protected void setEdgework(edgework ew){e=ew;}protected void setBombConfig(bombConfig bc){b=bc;}
	public boolean isSolved(){return solved;}//set solved to be true after printing the last line of the solution
	protected abstract boolean valid(String s);
}
