import java.util.*;
class StringOccur
{
	public static int findoccur(String str, char ch, int index)
	{
		if(index>=str.length())
			return 0;
		int count=0;
		if(str.charAt(index)==ch)
			count++;
		return count + findoccur(str,ch,index+1);
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Enter the Character: ");
		char ch=sc.next().charAt(0);
		int res=findoccur(str,ch,0);
		System.out.println("The Character " +ch+ " occurs " +res+ " times");
		
	}
}