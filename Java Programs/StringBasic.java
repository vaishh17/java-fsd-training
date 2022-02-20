import java.util.*;
class StringBasic
{
	public static void main(String[] args)
	{
		int i;
		System.out.println("Enter the string size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the string elements in string 1");
		String str1[]=new String[size];
		for(i=0;i<size;i++)
		{
		str1[i]=sc.next();
		}
		System.out.println("Enter the string elements in string 2");
		String str2[]=new String[size];
		for(i=0;i<size;i++)
		{
			str2[i]=sc.next();
		}
		System.out.println("Elements in String 1 are: ");
		for(i=0;i<size;i++)
		{
		System.out.print(str1[i]+ " ");
		}
		System.out.println("\nElements in String 2 are: ");
		for(i=0;i<size;i++)
		{
			System.out.print(str2[i]+ " ");
		}
}
}