package Logical_Programs;

import java.util.Scanner;

public class Scanner_Reverse_String 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String name = sc.next();
		
		String rev = "";
		for(int z=name.length()-1;z>=0;z--)
		{
		   rev = rev + name.charAt(z);
		}
		System.out.println("Reverse String : "+rev);
	}

}
