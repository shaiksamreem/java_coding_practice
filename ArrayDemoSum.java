package com.ds.structures;
import java.util.Scanner;
public class ArrayDemoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
	System.out.println("Enter a array length");
	
	int size = scan.nextInt();   //first step to give input for user
	int[] array = new int[size]; // taking size of length of array
	System.out.println("Enter " + size + " elements");
	
	for(int i=0;i<size;i++){
		System.out.println("enter value: " + i); //show index values
		array[i]=scan.nextInt(); //taking values of array
	}
	
	for(int num : array) {  //copying values from array to num
		System.out.print(num+ " ");
	}
	System.out.println();//next line
	
	int sum=0; //sum of values
	for(int i=0;i<size;i++){ //i=0;i<3; i=1;i<3
		sum = sum+array[i]; //0=0+2   2=2+3
		
	}
	System.out.println("sum: " +sum);
	}

}
