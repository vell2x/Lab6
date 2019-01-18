import java.util.Random;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		Scanner scnr1 = new Scanner(System.in);
		
		int numOfSides;
		String cont;
		
		System.out.println("Welcome to the Grand Circus Casino!");
		
		do {
			System.out.print("How many sides should each die have? ");
			numOfSides = scnr1.nextInt();
			
			int die1 = generateRandomDieRoll(numOfSides);
			int die2 = generateRandomDieRoll(numOfSides);
			
			System.out.printf("Die 1: %d\n", die1);
			System.out.printf("Die 2: %d\n", die2);
			
			if(!(DiceRollerApp.diceRoller(die1, die2) == "")) {
				System.out.println(DiceRollerApp.diceRoller(die1, die2));
			}
			
			System.out.print("Roll again? (y/n): ");
			cont = scnr.nextLine();
		}while(!cont.equalsIgnoreCase("n"));
		System.out.println("Thank you for visiting! Goodbye.");
		scnr.close();
		scnr1.close();
	}

	public static int generateRandomDieRoll(int numOfSides) {
		Random rand = new Random();
		
		int radNum = rand.nextInt(numOfSides) + 1;
		
		return radNum;
	}
}
