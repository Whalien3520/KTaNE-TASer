package abstraction;
import bossMods.*;
public class moduleIdentifier {
	public moduleIdentifier(){}
	public module ID(String s){
		switch(s){
		case"Forget Me Not":return new forgetMeNot();
		}
		return null;
	}
}
