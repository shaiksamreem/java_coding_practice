package com.samreen.oops.looping;
import java.util.Scanner;
public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of numbers");
		
		//int ages[] = new int[10];
		
		//enter a array length
		int length = scan.nextInt();
		int age[] = new int[length];
		
		System.out.println("Enter " + age.length + " ages");
		for(int i=0 ; i<age.length-1;i++) {
			age[i] = scan.nextInt();
		}
		
		System.out.print("[");
		for(int i =0;i<=age.length-1;i++)
			if(i<age.length-1) {
				System.out.print(age[i]+",");
			}
			else {
				System.out.print(age[i]);
			}
		System.out.println("]");
	}

}
