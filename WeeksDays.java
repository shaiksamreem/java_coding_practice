package kodnest;
import java.util.Scanner;

public class WeeksDays {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //input for keyboard
		System.out.println("enter a week");
		int weekDays = scan.nextInt();
		
		// int weekDays=2;     // intilalize 
		
		switch( weekDays)
		{
		case 1:
			System.out.println("sunday is a fun day");
			break;
		case 2:
			System.out.println("monday is a working day");
			break;
		case 3:
			System.out.println("tuesday working day");
			break;
		case 4:
			System.out.println("wednesday is a working day");
			break;
		case 5:
			System.out.println("thrusday is a working day");
			break;
		case 6:
			System.out.println("friday is a prayer day");
			break;
		case 7:
			System.out.println("saturday is a weeked day");
			break;
		default:
			System.out.println("not valid option");
			
		}

	}

}
