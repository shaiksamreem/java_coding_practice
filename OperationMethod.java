package kodnest;

public class OperationMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=======================");
		System.out.println("start");
		add();
		int diff=sub();
		System.out.println("difference: "+diff);
		mul(20,20);
		double divided=div(48,2);
		System.out.println("divided by: "+divided);
		System.out.println("end");
	
	}
	public static void add() {  //no parmeters no return value
	
		int a=10;
		int b=20;
		int c=a+b; 
		System.out.println("Addition Result: " +c); 
		
		} 
	
	public static int sub() // no parameters but return value
	{ 

		int num1=10;
		int num2=5;
		int num3=num1-num2;
		return num3;
		
		

	}
	
	public static void mul(int num1,int num2) //no return value but parameters
	{
		
		int product=num1*num2;
		System.out.println("product is:"+product);
	}

	

	public static double div(int numentar,int demenator)
	{
		double quo=numentar/demenator;
		return quo;
	}
}


