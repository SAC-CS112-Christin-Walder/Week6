import java.util.Scanner;

public class Lab3b
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int randomNum = 0 + (int)(Math.random() * 10);
		
		String result;
		
		//String big = "Your guess is too big";
		//String small = "Your guess is too small";
		
		System.out.print("Guess an integer between 0 and 10: ");
		int userNum=input.nextInt();
		
		if (userNum < 0 || userNum > 10)
			System.out.println("Your integer is not between 0 and 10");
		
		else {
		result = (userNum==randomNum) ? "correct." : "incorrect";
		System.out.printf("Your answer is %s", result); 
			{
				if (userNum < randomNum)
					System.out.println(" - it is too small.");
				else if (userNum > randomNum)
					System.out.println(" - it is too big.");
			}
		}
		
		if (userNum >= 0 && userNum <= 10)
			System.out.printf("The correct integer is %d.", randomNum);
	}

}