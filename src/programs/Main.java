package programs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//Run Programs
		//Password(input);
		WordCount(input);
	}

	
	
	public static void Password(Scanner input) {
		
		boolean check = true;
		while(check == true) {
			
		System.out.println("Please create a password that is 6-10 characters long.");
		System.out.println("Your password must contain at least one number, one letter, and one upper-case letter.");
		String password = input.nextLine();
		int length = password.length();
		while(length > 10 || length < 6) 
		{
			System.out.println("Entered password does not contain 6-10 characters.");
			System.out.println("Please re-enter your password.");
			password = input.nextLine();
			length = password.length();
		}
		
		
		boolean uppers = false;
		boolean digits = false;
		for (int x = 0; x < length; x++) {
			
			
			char pos = password.charAt(x);
			if (Character.isUpperCase(pos)) 
			{
				uppers = true;
			}
			
			if (Character.isDigit(pos)) 
			{
				digits = true;
			}
			
		}
		if (uppers == true && digits == true) 
		{
			System.out.println("Password successfully created.");
			check = false;
			//System.out.println(password);
		}
		else 
		{
			System.out.println("Password does not contain at least one letter, uppercase letter, and digit.");
			System.out.println("Please re-enter your password.");
		}
		}
		
	}
	
	public static void WordCount(Scanner input) {
		
		String sentence;
		System.out.println("Please input a sentence using a space, period, comma, semicolon, question mark,\nexclamation point, or dash to seperate each word.");
		sentence = input.nextLine();
		
		String[] cut;
		cut = sentence.split("\\W+");
		System.out.println(cut.length);
		
		
		
	}
}
