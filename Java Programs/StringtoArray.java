import java.util.*;
class StringtoArray
{
	
	public static void main(String[] args)
	{
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char arr[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			arr[i]=str.charAt(i);
					
		}
		System.out.println("The conversion from string to an array is: ");
		for(int i=0;i<str.length();i++)
		{
			System.out.print(arr[i]+ "  ");
			int temp,start,end;
			int revarray;
			if(start>=end)
				return;
			temp = arr[start];
			arr[start]=arr[end];
			arr[end]= temp;
			revarray(arr,start+1,end-1);
		}
		
	}
}