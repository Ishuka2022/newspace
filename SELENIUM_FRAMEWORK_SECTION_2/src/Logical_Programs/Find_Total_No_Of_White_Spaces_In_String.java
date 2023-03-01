package Logical_Programs;

public class Find_Total_No_Of_White_Spaces_In_String 
{
	public static void main(String[] args) 
	{
		String str = "Navnath Kam Ble Ish Kha";
		int count = 0;
		             
		           //o<=last index... 1<=
		for(int i=0; i<=str.length()-1; i++)
		{                     // 0..1    // a..' '
			char s1 = str.charAt(i);
			System.out.print(s1+"");
			if(s1=='a')   // a==' ' ... ' '==' '
			{
				count++; 
			}
		}
		System.out.println("");
		System.out.println(">>no of 'a' in given string :"+count);
		
		//************************
				count = 0;
		for(int i=0; i<=str.length()-1; i++)
		{                     // 0..1    // a..' '
			char s1 = str.charAt(i);
			System.out.print(s1+"");
			if(s1=='h')   // a==' ' ... ' '==' '
			{
				count++; 
			}
		}
		System.out.println("");
		System.out.println(">>no of 'h' in given string :"+count);
	}

}
