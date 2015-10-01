import java.util.Scanner;

public class Lab5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int count = 1;
		
		do {
			
			int randomNum = 0 + (int)(Math.random() * 10);
			
			System.out.print("Guess an integer: ");
			int userNum=input.nextInt();
			
			if (userNum < 0 || userNum > 10)
				System.out.println("Your integer is not between 0 and 10");
			else {
			
				if (userNum > randomNum)
					System.out.print("Your integer is too big");
				
				else if (userNum < randomNum)
					System.out.print("Your integer is too small");
				
				else if (userNum == randomNum)
					System.out.print("Your integer is correct");
			
			if (userNum >= 0 && userNum <= 10)
				System.out.printf(" - the random integer was %d.\n", randomNum); }
			
			if (count<3)
				System.out.println("Let's try again!\n");
			if(count==3)
				System.out.print("...you are out of guesses");
		
			count++; }
		
		while (count<4); }
		
	}

