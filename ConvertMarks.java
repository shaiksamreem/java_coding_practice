package kodnest;
import java.util.Scanner;
public class ConvertMarks {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter a marks out of 100");
        int marks = sc.nextInt();
        int score = marks/10;  // if we give 100 it will divided by 100/10=10 ; 90/10=9
        
        switch(score){
        case 10:
        case 9:
        case 8:
        	System.out.println("A GRADE");
        	break;
        	
        	
        case 7:
        case 6:
        	System.out.println("B GRADE");
        	break;
        	
        	
        case 5:
        case 4:
        	System.out.println("C GRADE");
        	break;
        	
        default:
        	System.out.println(" D GRADE");
        		
        	
        
        }
        
        
	}

}
