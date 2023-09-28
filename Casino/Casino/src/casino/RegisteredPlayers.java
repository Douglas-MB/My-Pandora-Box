package casino;

import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

public class RegisteredPlayers {
	//I have chosen to use Hashtable class because I am not working with treads stuffs
	public static Hashtable<String, Player> regPlayers = new Hashtable<>();

	private static Scanner scan = new Scanner(System.in);

	private static String getPlayerId(){
		System.out.print("Player name:  ");
		String str = scan.nextLine();
		return str;
	}
	public static void registerPlayer(){
		regPlayers.put(getPlayerId(), new Player());
	}
}
