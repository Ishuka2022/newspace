package Logical_Programs;

public class Nayu_Prime 
{
		public static void main (String[] args)
		   {		 
		       String  primeNumbers = "";
	
		       for ( int i = 1; i<= 1000; i++)         
		       { 		  	  
		          int counter=0; 	  
		          for(int j =i; j>=1; j--)
		          {    
		             if(i%j==0)
			     {
		 		counter = counter + 1;
			     }
			  }
			  if (counter ==2)
			  {
			     primeNumbers = primeNumbers + i + " ";
			  }	
		       }	
		       System.out.println("Prime numbers from 1 to 1000 are :");
		       System.out.print(primeNumbers);
		   }
		
	}
