import java.util.Arrays;
import java.util.*;
class ArrayString
{
	public static void main(String[] args)
	{
		System.out.println("Enter the Size of string ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the String array elements ");
		String[] str=new String[size];
		int sum = 0;
		for(int i=0;i<size;i++)
		{
			str[i]=sc.next();
		}
		System.out.println("The elements in the String array are ");
		for(int i=0;i<size;i++)
		{
		System.out.println(str[i]+", ");
		}	
		int [] arr=new int[str.length];
		
		for(int i=0;i<str.length;i++)
		{
			arr[i]=Integer.valueOf(str[i]);
			
		}
		System.out.println("Enter the array elements ");
		for(int i=0;i<str.length;i++)
		{
		System.out.println(arr[i]);
		}
		for(int i=0;i<str.length;i++)
		{
			
			sum+=arr[i];
		}
		System.out.println("The sum is " +sum);
		
}
}
		