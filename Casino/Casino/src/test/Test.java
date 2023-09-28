package test;

import casino.*;

public class Test {

	public static int testPlayerRoll(){

		for (int i = 0; i < 9999; i++) {
			int aux = Player.playerRoll();
			if (aux <= 0 || aux > 6){
				return -1;
			}
		}

		return 0;
	}

	public static int testCasinoRoll(){
		for (int i = 0; i < 9999; i++) {
			int aux = Casino.casinoRoll();
			if (aux <= 0 || aux > 6){
				return -1;
			}
		}

		return 0;
	}
	public static int testDieRoll(){
		Die die = new Die();
		for (int i = 0; i < 9999; i++) {
			int aux = die.roll();
			if (aux <= 0 || aux > 6){
				return -1;
			}
		}

		return 0;
	}

	public static void testMatch(){
		Match match = new Match();
		match.runMatch();

	}

	public static void main(String[] args) {
	}
}
