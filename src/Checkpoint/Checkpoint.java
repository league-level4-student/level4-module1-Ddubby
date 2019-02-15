package Checkpoint;

import java.util.Random;

public class Checkpoint {
	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt(5);
		switch (x) {
		case 0:
			System.out.println("The number is 0");
			break;
		case 1:
			System.out.println("The number is 1");
			break;
		case 2:
			System.out.println("The number is 2");
			break;
		case 3:
			System.out.println("The number is 3");
			break;
		case 4:
			System.out.println("The number is 4");
			break;
		}
		System.out.println("(Check) number is " + x);
	}
}
