package Logical_Programs;

public class Polimdrome_NUMBER     // Forward will be same as a rev
{
	public static void main(String[] args) 
	{
		String s1 ="Automation";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev = rev+s1.charAt(i);
		}
		System.out.println(rev);
	
		System.out.println(" ");
		if(s1.equals(rev))
		{
			System.out.println("Given string is polindrome");
		}
		else
		{
			System.out.println("Given string is not polindrome");
		}
	}

}
