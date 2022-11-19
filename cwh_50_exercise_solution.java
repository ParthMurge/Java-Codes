package company;

import java.util.Random;
import java.util.Scanner;

class Game
{
	int number;
	int inputNumber;
	int noOfGuesses = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public int getNoOfGuesses() {
		return noOfGuesses;
	}
	
	public void setNoOfGuesses(int noOfGuesses) {
		this.noOfGuesses = noOfGuesses;
	}

	Game()
	{
		Random rand = new Random();
		this.number = rand.nextInt(100);
	}
	

	void takeUserInput()
	{
		System.out.print("\nGuess the number : ");
		inputNumber = sc.nextInt();
	}
	
	boolean isCorrectNumber()
	{
		noOfGuesses++;
		if(inputNumber == number)
		{
			System.out.format("\nYes you guessed it right. \nThe number is %d, and you guessed it in %d attempts." ,number,noOfGuesses);
			return true;
		}
		else if(inputNumber < number)
		{
			System.out.println("You gussed it low.");		
		}
		else if(inputNumber > number)
		{
			System.out.println("you guessed it high.");		
		}
		
		return false;
	}
}
public class cwh_50_exercise_solution
{

	public static void main(String[] args)
	{
		Game g = new Game();
		boolean b = false;
		
		while(!b)
		{
			g.takeUserInput();
			b = g.isCorrectNumber();
		}
	}

}
