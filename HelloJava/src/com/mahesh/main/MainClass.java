package com.mahesh.main;

public class MainClass {
	
	public static void main(String[] args)
	{
		System.out.println("Hello Java, this is Mahesh on Focus");
//		printStar(3);
		System.out.println(reverseRec("Mahesh"));
	}

	public static void printStar(int row)
	{
		int spaceCounter=row;
		int starCounter=1;
		for(int i=0;i<row;i++)
		{
			for(int j=spaceCounter;j>0;j--)
			{
				System.out.print(" ");
			}
			
			for(int x=0;x<starCounter;x++)
			{
				System.out.print("*");
			}
			System.out.println("");
			spaceCounter-=1;
			starCounter+=2;
		}
		
	}

	public static String reverseRec(String str)
	{
		if(str==null || str.length()<2)
			return str;
		else
		return reverseRec(str.substring(1))+str.charAt(0);
	}
}
