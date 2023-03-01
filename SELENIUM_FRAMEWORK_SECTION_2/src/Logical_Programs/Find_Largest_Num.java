package Logical_Programs;

import java.util.Scanner;

public class Find_Largest_Num 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Num : ");
		int a = sc.nextInt();
		
		System.out.println("Enter Secound Num : ");
		int b = sc.nextInt();
	
		System.out.println("Enter Third Num : ");
		int c = sc.nextInt();
		
		// Approach  >>>> Logic
		if(a>b && a>c)
		{
			System.out.println(a+" is a largest number");
		}
		else if (b>a && b>c)
		{
			System.out.println(b+" is a largest number");
		}
		else
		{
			System.out.println(c+" is a largest number");
		}
	}
	
}
