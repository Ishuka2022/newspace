package Logical_Programs;

import java.util.Scanner;

public class SCANNER_REVERSE_NUMBER
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" ENTER NUMBER : ");
		int num = sc.nextInt();
		{
		 int rev = 0; 
		while(num >0)
		{
			rev = rev * 10 + num % 10;  
			
			num = num / 10;
		}
		System.out.println("Reverse Number : "+rev);
	}
	}
}
