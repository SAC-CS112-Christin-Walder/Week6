import java.util.Scanner;

public class Lab3a
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int randomNum = 0 + (int)(Math.random() * 10);
		
		System.out.print("Guess an integer between 0 and 10: ");
		int userNum=input.nextInt();
		
		if (userNum < 0 || userNum > 10)
			System.out.println("Your integer is not between 0 and 10");
		
		else 
			if (userNum>randomNum)
				System.out.println("Your integer is too big");
			else if (userNum<randomNum)
				System.out.println("Your integer is too small");
			else if (userNum==randomNum)
				System.out.println("Your integer is correct!");
		
		if (userNum >= 0 && userNum <= 10)
			System.out.printf("The correct integer is %d", randomNum);
	}

}