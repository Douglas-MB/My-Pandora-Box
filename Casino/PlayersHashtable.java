package project;

import java.util.ArrayList;
import java.util.HashMap;

public class PlayersHashtable {
	private final HashMap<String, Player> playersList;

	private Player player;
	public PlayersHashtable() {
		this.playersList = new HashMap<>();
	}

	public HashMap<String, Player> getPlayersList() {
		return playersList;
	}

	protected void addNewPlayer(){
		player = new Player();
		playersList.put(player.getPlayerId(), player);
	}

	protected Player getPlayer(){
		return playersList.get(player.getPlayerId());
	}


}
