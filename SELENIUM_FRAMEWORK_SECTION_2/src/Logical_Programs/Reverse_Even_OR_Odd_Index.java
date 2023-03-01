package Logical_Programs;

public class Reverse_Even_OR_Odd_Index 
{
	public static void main(String[] args) 
	{
		String s2 = "I Love My India";
        String [] ar = s2.split(" ");
        
        for(int i=0;i<=ar.length-1;i++)
        {
        	String org = ar[i];
        	
        	if (i%2==0)
        	{
        		String rev="";
        		for(int j=org.length()-1;j>=0;j--)
        		{
        			rev = rev+org.charAt(j);
        		}
        		System.out.print(rev+" ");
        	}
        }
        System.out.println( );
       System.out.println("==================OR===============");
        String s3 = "I Love My Angel";
        String []ar1 = s3.split(" ");
        
        for(int a=0;a<=ar1.length-1;a++)
        {
        	String org1 = ar1[a];
        	String rev1 = reverseString(org1);
        	System.out.print(rev1+" ");
        }
	}
     public static String reverseString(String inp)
     {
    	 String  rev1 ="";
    	 for(int b=inp.length()-1;b>=0;b--)
    	 {
    		rev1 = rev1+inp.charAt(b);
    	 }
    	 return rev1;
     }

	}