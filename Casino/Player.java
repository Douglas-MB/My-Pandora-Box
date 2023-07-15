package project;

import java.util.ArrayList;

public class Player {

	private final Die diePlayer = new Die();
	private final String playerId;
	private final ArrayList<Integer> playerRolls;
	private int numberWin;
	private int numberLose;

	public Player() {
		this.playerId = makePlayerId();
		this.playerRolls = new ArrayList<>();
		this.numberWin = 0;
		this.numberLose = 0;
	}

	public int getNumberWin() {
		return numberWin;
	}

	public int getNumberLose() {
		return numberLose;
	}

	public String getPlayerId() {
		return playerId;
	}

	public ArrayList<Integer> getPlayerRolls() {
		return playerRolls;
	}

	private String makePlayerId(){
		return MyUtils.getRandomNum(1000,10000)+"";
	}

	protected void doPlayerRoll(){
		playerRolls.add(diePlayer.rollADie());
	}
	protected int getRollPlayer(){
		return playerRolls.get(playerRolls.size() - 1);
	}

	protected void playerWin(){
		++numberWin;
		System.out.println("PLAYER WINS!!!");
	}

	protected void playerLose(){
		++numberLose;
	}
}
