package Logical_Programs;

public class REVERSE_NUMBER_SERIES
{
	public static void main(String[] args) 
	{  
	 int Rev = 0;  int NUM =321;
	                                        // % = mode = remainder
	 while(NUM > 0)                        //  divide = /
	 {                                          
		 Rev = Rev * 10 + NUM % 10;      //1// 0*10+123%10 = 0+3 = 3
				                         //2// 3*10+2 = 32
		                                 //3// 32*10+1 = 321
		 
		NUM = NUM / 10;                  // 123 /10 = 12
		                                 // 12/10 = 1
		                                 // 1/10 = 0
	 }
	 System.out.println(" REVERSE NO IS : "+Rev);
	}

}
