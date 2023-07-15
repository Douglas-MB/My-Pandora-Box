package project;

public class Match {
	private  PlayersHashtable players;
	private  GameRules rules;

	public Match() {
	}

	public void play(){
		PlayersHashtable testList = new PlayersHashtable();
		testList.addNewPlayer();

		GameRules matchJudge = new GameRules();
		Player player = testList.getPlayer();
		Casino casino = new Casino();

		boolean matchStatus = true;
		while (matchStatus){
			player.doPlayerRoll();
			casino.doCasinoRoll();

			matchJudge.verifyRoll(player, casino);

			System.out.printf("%s roll is %d%n",player.getPlayerId(), player.getRollPlayer());
			System.out.printf("Casino roll is %d%n", casino.getRollCasino());

			System.out.print("\nDo you wanna continue playing more?\t");
			matchStatus = continuePlay();
		}
		int totalRoll = player.getNumberWin() + player.getNumberLose();
		final String RED = "\u001b[31m";
		final String GREEN = "\u001b[32m";

		for (String playerKey : testList.getPlayersList().keySet()){
			System.out.println("Player "+ playerKey+"\n-----------------");
			System.out.println("Rolls:\t"+player.getPlayerRolls());
			System.out.println("Results: "+" wins: "+GREEN+player.getNumberWin()+ " loses: "+RED+player.getNumberLose()+ " " +
					"| " + MyUtils.RESET_COLOR_TEXT+
					"total rolls: "+  totalRoll);
		}

	}


	private boolean continuePlay(){

		class VerifyCondition{

			private final boolean optionCond;
			public  VerifyCondition(String opt) {
				this.optionCond = checkOption(opt);
			}

			public boolean isOptionCond() {
				return optionCond;
			}

			private boolean checkOption(String opt){
				final String[] aux = new String[]{"YES", "Y", "yes", "y", "Yes", "YEs", "yES", "yeS", "YeS"};
				for (int i = 0; i < aux.length; i++) {
					if (opt.equals(aux[i])){
						return true;
					}
				}
				return false;
			}
		}


		final String option = MyUtils.newScan().nextLine();

		VerifyCondition optCond = new VerifyCondition(option);

		return optCond.isOptionCond();
	}

}
