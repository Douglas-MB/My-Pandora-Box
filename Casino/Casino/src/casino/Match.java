package casino;

import java.util.Scanner;

public class Match {
	private int playerRoll;
	private int casinoRoll;

	private boolean result;

	private boolean matchState;

	public Match() {
		playerRoll = -1;
		casinoRoll = -1;
		result = true;
	}

	private void startMatch(){
		rollDices();
		checkRolls(playerRoll, casinoRoll);
		showResult();
	}

	private void endMatch(){
		matchState = false;
	}
	private void continueMatch() {
		startMatch();
	}
	private void rollDices(){
		playerRoll = Player.playerRoll();
		casinoRoll = Casino.casinoRoll();

	}

	private void checkRolls(int playerRoll, int casinoRoll){

		if (playerRoll != casinoRoll){
			result = false;
			Player.lose();
		}
		if (playerRoll == casinoRoll){
			result = true;
			Player.win();
		}
	}

	private void showResult(){
		if (result){
			System.out.println("YOU WIN!");
		}else {
			System.out.println("YOU LOSE!");
		}
		System.out.printf("PLAYER roll: %d \t CASINO roll: %d %n", playerRoll, casinoRoll);
	}

	private void showMatchResults(){
		System.out.printf("WIN:%d  LOSE:%d  TOTAL:%d%n", Player.getWinCnt(), Player.getLoseCnt(),
				Player.getTotalRolls());
	}

	private boolean getUsrReply(){
		Scanner scan = new Scanner(System.in);
		String auxScan = scan.nextLine().toUpperCase();
		char firstChar = auxScan.charAt(0);

		return firstChar == 'Y';
	}

	public void runMatch(){
		RegisteredPlayers.registerPlayer();
		matchState = true;

		startMatch();

		while (matchState) {
			System.out.println("Do u want to roll again?");
			boolean usrReply = getUsrReply();
			if (!usrReply){
				endMatch();
				break;
			}
			continueMatch();
		}
		Player.calcTotRolls();
		System.out.println("Thanks!");
		showMatchResults();
	}

}
