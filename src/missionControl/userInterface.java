package missionControl;
import java.util.Scanner;
public class userInterface{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		gameState g=new gameState();
		while(true){g.input(scan.nextLine());}
	}
}
