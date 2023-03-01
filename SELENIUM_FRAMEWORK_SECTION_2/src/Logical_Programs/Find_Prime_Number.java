package Logical_Programs;

public class Find_Prime_Number 
{
	public static void main(String[] args) 
	{
	     int Num = 163;
	     int count=0;
	     
	     for(int i=2;i<Num;i++)
	     {
	    	 if(Num%i==0)
	    	 {
	    	 count++;
	    	 break;
	          }
	     }
	     if(count==0)
	     {
	    	 System.out.println("Given Num is Prime Number ");
	     }
	     else
	     {
	    	 System.out.println("Given Num is Not Prime Number");
	     }
	}
}
