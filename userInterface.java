package missionControl;
import java.util.Scanner;
public class userInterface{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter bomb configuration, with notation solveables+needies/minutes:seconds");
		gameState g=new gameState(scan.nextLine());
	}
}
