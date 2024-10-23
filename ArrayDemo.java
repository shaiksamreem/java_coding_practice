package com.samreen.oops.looping;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// enter number of customers
		System.out.println("enter the customers");
		String names[] = new String[scan.nextInt()];
		System.out.println("Enter number of customers "+names.length+" names");
		// length 
		for(int i=0;i<=names.length-1;i++) {
			System.out.println("enter name of the customer"+i);
			names[i]=scan.next();
		}
		// data of customer
		System.out.print("[");
		for(int i =0;i<=names.length-1;i++)
			if(i<names.length-1){
			System.out.print(names[i]+",");
		}
		else {
			System.out.print(names[i]);
		}
		
System.out.println("]");
	}

}
