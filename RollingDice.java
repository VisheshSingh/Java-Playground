import java.util.Random;

public class RollingDice {
	int dice[] = { 1, 2, 3, 4, 5, 6 };
	Random myRand = new Random();

	public int getDiceFace() {
		int index = myRand.nextInt(dice.length);
		int result = dice[index];
		return result;
	}

	public static void main(String[] args) {
		RollingDice rd = new RollingDice();
		System.out.println("You rolled: " + rd.getDiceFace());
	}

}
