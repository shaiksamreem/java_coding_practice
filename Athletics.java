package kodnest;

public class Athletics {
	public static void main(String args[])
	{
	float athlete1Weight=68.45f;
	float athlete2Weight=70.55f;
	
	double athlete1Time=9.8576341234;
	double athlete2Time=10.0012345678;
	
	String Winner;
	Winner=(athlete1Time>athlete2Time)?"athlete1Time":"athlete2Time";
	
	System.out.println("athletic weights : "+athlete1Weight+"kg");
	System.out.println("athletic weights : "+athlete2Weight+"kg");
	System.out.println("athletic weights : "+athlete1Time+"seconds");
	System.out.println("athletic weights : "+athlete2Time+"seconds");
	System.out.println( "Winner of the race: "+Winner);
	
	
	}
	
	
	

   }
