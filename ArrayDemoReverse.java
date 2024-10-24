package com.ds.structures;
import java.util.Scanner;
public class ArrayDemoReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of elements");
		int size=scan.nextInt();
		int[] array = new int[size];
		
		for(int i=0;i<size;i++){
			array[i]=scan.nextInt();
		}
		System.out.println("contain elements are: ");
		for(int num:array){
			System.out.print(num+" ");
		}
		System.out.println();
		
		int array1[]=new int[size];
		
		for(int i=0;i<size;i++){
			array1[i]=array[size-1-i];
		}
		System.out.println("reverse of elements");
		for(int num1:array1){
			System.out.print(num1+" ");
		}

	}

}
