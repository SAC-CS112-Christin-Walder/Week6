import java.util.Scanner;

public class Week6	 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int randomNum = 0 + (int)(Math.random() * 10);
		
		//Have the user guess any integer
		System.out.print("Guess an integer: ");
		int userNum=input.nextInt();
		
		//Compare the users integer to the randomly generated integer
		//Print the result
		if (userNum > randomNum)
			System.out.println("Your integer is too big");
		
		else if (userNum < randomNum)
			System.out.println("Your integer is too small");
		
		else if (userNum == randomNum)
			System.out.println("Your integer is correct");
		
		//Print the random, computer-generated integer
		System.out.printf("The correct integer is %d", randomNum);
	}

}