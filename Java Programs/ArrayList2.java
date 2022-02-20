import java.util.*;
class ArrayList2
{
	public static void main(String[] args)
	{
		ArrayList<String>a1=new ArrayList<String>();
		{
			a1.add("apple");
			a1.add("manago");
			a1.add("strawberry");
			System.out.println("ArrayList a1 contains: " +a1);
			ArrayList<String>a2=new ArrayList<String>();
			a2.add("banana");
			a2.add("apple");
			System.out.println("ArrayList a2 contains: " +a2);
			a1.retainAll(a2);
			Iterator itr =a1. iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
	}
}