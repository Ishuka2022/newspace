package Logical_Programs;

public class Armstrong_Number 
{
	public static void main(String[] args) 
	{
		 int OrgNum = 153;
		 int sum = 0;
		 
		           // 153   153>0.... 153/10 = 15
		 for( int i=OrgNum; i>0; i=i/10)
		 {
			    int rem = i%10;   // 153%10 = 3....15%10=5
			    sum = sum + (rem*rem*rem);
			          // 0+(3*3*3) = 27....27+(5*5*5)=152
			    
		 }
			    if(OrgNum==sum)
			    {
			    	System.out.println("given number " +OrgNum+" is an armstrong number");
			    }
			    else
			    {
			    	System.out.println("given number"+OrgNum+"is not an armstrong number");
			    }
			    
//		    int rem = OrgNum%10;    //Orignal No mdun jr last digit get karaych asel tr
//		   System.out.println(rem);
//		                
//		    OrgNum = OrgNum/10;
//    System.out.println(OrgNum); // orignal no mdun last digit delete karaych assel tr
		
	}

}
