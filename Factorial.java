package kodnest;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
	
		int factorial=1;
		for (int i=1; i<=n;i++)
		{
			System.out.print(factorial + " * "+i+" = ");
			factorial = factorial*i;
			System.out.println(factorial);
		}
		System.out.println("factorial of number is"+n+"is"+factorial);

	}

}
