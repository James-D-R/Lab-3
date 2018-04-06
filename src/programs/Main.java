package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//Run Programs
		Password(input);
		WordCount(input);
		PhoneNumber(input);
		CreateID(input);
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
	
	public static void PhoneNumber(Scanner input) {
		
		String number;	
		boolean check = true;
		String exit;
		
		while(check == true) 
		{
			boolean digits = true;
			
			System.out.println("Please enter a 10-digit number to be converted into a phone number");
			number = input.nextLine();
			
			for (int x =0; x < number.length(); x++) 
			{
				char position = number.charAt(x);
				
				if (Character.isDigit(position)) 
				{	
				}
				else 
				{
					digits = false;
				}
			}
			
			if (digits == true) 
			{
				if (number.length() == 10) 
				{
					System.out.println("("+ number.substring(0,3) + ")" + number.substring(3,6) + "-" + number.substring(6));
				}
				else 
				{
					System.out.println("Error: entered number must only contain 10 digits.");
				}
			}
			else 
			{
				System.out.println("Error: not all characters entered were numbers, please re-enter the number.");
			}
			
			System.out.println("To enter another number, press enter. To end the program, enter 999.");
			exit = input.nextLine();
			
			if (exit.equals("999")) 
			{
				check = false;
			}	
			
		}
	}
	
	public static void CreateID (Scanner input) {
		
		String fullName;
		String fullAddress;
		String fullID;
		String idLetters = "";
		String idNumbers = "";
		String next;
		boolean loop = true;
		
		ArrayList<Person> persons = new ArrayList<Person>();
		
		
		while(loop == true) 
		{
			System.out.println("This program will create an ID based on the inputed name and address.");
			System.out.println("Please input your full name. (Example: James Remer):");
			fullName = input.nextLine();
			
			System.out.println("Please input your street address. (Example: 818 Dunwoody Blvd.)");
			fullAddress = input.nextLine();
			
			for(int x = 0; x < fullName.length(); x++) 
			{
				char letter = fullName.charAt(x);
				if (Character.isUpperCase(letter)) 
				{
					idLetters = idLetters + Character.toString(letter);
				}
			}
			
			for (int y = 0; y < fullAddress.length(); y++) 
			{
				char number = fullAddress.charAt(y);
				if (Character.isDigit(number)) 
				{
					idNumbers = idNumbers + Character.toString(number);
				}
			}
			
			fullID = idLetters + idNumbers;
			
			persons.add(new Person(fullName, fullAddress, fullID));
			
			fullName = "";
			fullAddress = "";
			fullID = "";
			idLetters = "";
			idNumbers = "";
			
			System.out.println("Press enter to continue, or enter any key to add another name and address.");
			next = input.nextLine();
			
			if (next.equals("")) 
			{
				loop = false;
			}
		}
		
		for (int i = 0; i < persons.size(); i++) 
		{
			Person object = persons.get(i);
			fullName = object.name;
			fullID = object.id;
			System.out.println("Name:" + fullName);
			System.out.println("ID:" + fullID);
			System.out.println("");
		}
		
		
	}
	
	
	
	
	
	
}
