import java.util.Scanner;

public class Lab2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int randomNum = 0 + (int)(Math.random() * 10);
	
		System.out.print("Guess an integer: ");
		int userNum=input.nextInt();
		
		if (userNum > randomNum)
			System.out.println("Your integer is too big");
		
		else if (userNum < randomNum)
			System.out.println("Your integer is too small");
		
		else if (userNum == randomNum)
			System.out.println("Your integer is correct");
		
		else
			System.out.println("Your input is invalid");
		
		System.out.printf("The correct integer is %d", randomNum);
	}

}