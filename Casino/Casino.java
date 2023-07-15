package project;

public class Casino {

	private final Die dieCasino;
	private  int casinoRoll;

	public Casino() {
		this.dieCasino = new Die();
	}

	protected void doCasinoRoll(){
		casinoRoll = dieCasino.rollADie();
	}
	protected int getRollCasino(){
		return casinoRoll;
	}

	protected void casinoWin(){
		System.out.println("CASINO WINS!!!");
	}


}
