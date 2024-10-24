package com.ds.structures;
import java.util.Scanner;
public class ArrayDemoCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of length");
		int size = scan.nextInt();
		int[] array = new int[size];
		
for(int i =0;i<size;i++) {
	array[i]=scan.nextInt();
}

System.out.println("contains elements");
for(int num:array){
	System.out.print(num+" ");
}
System.out.println();

int[] array2 = new int[size]; //second array list

for(int i=0;i<size;i++){   //iterative number
array2[i]=array[i];
	}

System.out.println("copy contains are:");
for(int num1 : array2){
	System.out.print(num1+" ");
}
	}

}
