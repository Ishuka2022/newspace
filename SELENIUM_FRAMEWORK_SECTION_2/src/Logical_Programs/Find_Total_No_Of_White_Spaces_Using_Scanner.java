package Logical_Programs;

public class Find_Total_No_Of_White_Spaces_Using_Scanner 
{
	public static void main(String[] args) 
	{
		String Str = " ISH JAN Q LE LETA HAI";
		int count = 0;
		
		for(int i=0; i<=Str.length()-1;i++)
		{
			char s1 = Str.charAt(i);
			
			if(s1==' ')
			{
				count++;
			}
		}
		System.out.println("No of Spaces in Given String"+count);
	}

}
