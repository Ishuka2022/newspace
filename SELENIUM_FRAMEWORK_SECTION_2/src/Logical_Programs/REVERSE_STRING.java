package Logical_Programs;

public class REVERSE_STRING 
{
	public static void main(String[] args) 
{
	String ar = "ISHUKA";
	
	for(int i=ar.length()-1;i>=0;i--)
	{
		 char rev = ar.charAt(i);
		 
    	System.out.print(rev);
	}
	System.out.println("----OR----");
			
			String Org = "GODSHELWAR";
			String Rev = "";
			
			for(int j=Org.length()-1;j>=0;j--)
			{
				Rev = Rev +Org.charAt(j);
			}
			System.out.println(Org);
			System.out.println(Rev);
			
	}
}