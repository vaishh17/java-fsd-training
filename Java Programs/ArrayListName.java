import java.util.*;
class ArrayListName
{
	public static void main(String[] args)
	{
		ArrayList<String>Firstname=new ArrayList<String>();
		ArrayList<String>Lastname=new ArrayList<String>();
		ArrayList<String>Fullname=new ArrayList<String>();
		System.out.println("Enter the size ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the Firstname ");
		for(int i=0;i<size;i++)
		{
			String a=sc.next();
			Firstname.add(a);
		}
		System.out.println("Enter the Lastname ");
		for(int i=0;i<size;i++)
		{
			String b=sc.next();
			Lastname.add(b);
		}
		Iterator itr=Firstname.iterator();
		Iterator itr1=Lastname.iterator();
		while(itr.hasNext() && itr1.hasNext())
		{
			String s1=(String) itr.next();
			String s2=(String) itr1.next();
			Fullname.add(s1.concat(" " +s2));
		}
		System.out.println("The full name is " +Fullname);
	}
}