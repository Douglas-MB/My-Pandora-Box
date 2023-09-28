package casino;

import java.util.Random;

public class Die {

	private int dieNum = -1;

	public int roll(){
		RandomNumbers aux = new RandomNumbers();
		return aux.getNum();
	}

	class RandomNumbers {
		int num = -1;

		private RandomNumbers() {
			Random rdn = new Random();
			num = rdn.nextInt(1,7);
		}

		public int getNum() {
			return num;
		}
	}


}
