package project;

public class GameRules {
	protected void verifyRoll(Player player, Casino casino){
		int playerRollNumber = player.getRollPlayer();
		int casinoRollNumber = casino.getRollCasino();

		if (playerRollNumber == casinoRollNumber){
			player.playerWin();
		}else {
			player.playerLose();
			casino.casinoWin();
		}
	}

}
