package Logical_Programs;

public class Prime_Number 
{
	public static void main(String[] args)  
	{   
	     for(int i=1;i<=1000;i++)
		{
			  int count =0;
			for(int j=i;j>=1;j--)
			{
			if(i%j==0) 
			  {
				count = count+1;
			  }
			 }
			if(count ==2)
			{
				System.out.println(i+"no is prime");
			}
//			else
//			{
//				System.out.println(i+"no is not prime");
//			}
		}
	}
}