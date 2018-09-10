package controller;
import java.util.Scanner;
public class Controller
{

	public void start()
	{
		moreInput();
		System.out.println("Standard output for java ;)");
		System.out.println("woah");
		System.out.print("Same line");
		System.out.print(" as this");
		questions();
	
	}
	private void questions() 
	{
		System.out.println("What is your favorite color?...");
		Scanner inputScanner = new Scanner(System.in);
		String answer = inputScanner.nextLine();
		if(answer.equals("blue") || answer.equals("red") || answer.equals("green") || answer.equals("purple") || answer.equals("poirple") || answer.equals("black") || answer.equals("white") || answer.equals("brown")) {
		System.out.println(answer + " is my favorite color too!!!");
		} else { 
			if(answer.equals("EasterEgg")) {
				System.out.println("Hey Congratz! you found me :)");
			} else
			System.out.println("Thats not a color silly");
		}
		System.out.println("What about your favorite Food?");
		answer = inputScanner.next();
		
		System.out.print(answer + "! Wow! thats a good food!");
		inputScanner.close();
	}
	private void moreInput()
	{
		Scanner anotherInputScanner;
		anotherInputScanner = new Scanner(System.in);
		
		System.out.println("What is the meaning of Life, the universe, and everything?");
		int answer = anotherInputScanner.nextInt();
		System.out.println("You typed " + answer); //Used to consume the enter key press, ignore the return.
		System.out.println("Words - why the error??");
		anotherInputScanner.nextLine();
		String secondResponse = anotherInputScanner.nextLine();
		System.out.println(secondResponse);
		
		//Double holds real numbers
		double magicNumber;
		System.out.println("Type your favorite fractional number!");
		magicNumber = anotherInputScanner.nextDouble();
		anotherInputScanner.nextDouble();
		System.out.println(magicNumber);
//		anotherInputScanner.close();
		int magicInteger;
		System.out.println("Type your favorite solid number!");
		magicInteger = anotherInputScanner.nextInt();
		System.out.print(answer + "Thats my favorite number!");
		
	}
	
	
	
	public boolean validInt(String example)
	{
		boolean isValid = false;
		try
		{
			Integer.parseInt(example);
			isValid = true;
		}
		catch(NumberFormatException error)
		{
			System.out.println("Type in a valid int value!");
		}
		return isValid;	
	}
	public boolean validDouble(String example) 
	{
		
		boolean isValid = false;
		try
		{
			Double.parseDouble(example);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			System.out.println("Only floating point values are allowed for input");
		}
		return isValid;
	}
}