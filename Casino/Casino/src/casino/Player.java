package casino;

import java.util.Random;

public class Player {


	private static int winCnt = 0;
	private static int loseCnt = 0;

	private static int totalRolls = 0;

	private static String playerId;

	Player(){

	}

	public static int getWinCnt() {
		return winCnt;
	}

	public static int getLoseCnt() {
		return loseCnt;
	}

	public static int getTotalRolls() {
		return totalRolls;
	}

	public static int playerRoll(){
		return new Die().roll();
	}

	public static void calcTotRolls(){
		totalRolls = winCnt + loseCnt;
	}
	public static void win(){
		winCnt++;
	}

	public static void lose(){
		loseCnt++;
	}

	public static void generatePlayerId(){
		Random rdn = new Random();
		for (int i = 0; i < 8; i++) {
			char aux = (char) rdn.nextInt(48, 58);
			playerId = playerId + aux;
		}
	}
}
