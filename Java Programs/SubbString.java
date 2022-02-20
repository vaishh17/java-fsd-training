import java.util.*;
class SubbString
{
	public static boolean stringsub(String s1, String s2)
	{
		boolean res=false;
		res=s1.contains(s2);
		return res;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the String s1: ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println("Enter the String s2: ");
		String s2=sc.nextLine();
		boolean res=stringsub(s1,s2);
		System.out.println(res);
		
		
	}
}