import java.util.*;
class ArrayList1
{
	public static void main(String[] args)
	{
		ArrayList<String>names=new ArrayList<String>();
		names.add("Ravi");
		names.add("Vijay");
		names.add("Ajay");
		System.out.println("ArrayList containing elements is:" +names);
		names.add(2,"Sam");
		System.out.println("ArrayList after adding element at specified index position is:" +names);
		ArrayList<String>names1=new ArrayList<String>();
		names1.add("Rita");
		names1.add("Ann");
		System.out.println("The elements in arraylist names1 are: " +names1);
		names.addAll(names1);
		System.out.println("The List now contains all elements of names1 added in names: " +names);
		names.addAll(0,names1);
		System.out.println("The new list is: " +names);
		names.remove(0);
		System.out.println("After removing the element from the 0th index is: "+names);
		names.removeAll(names1);
		System.out.println("After removing the element mentioned: "+names);
		names.removeIf(str->str.contains("Sam"));
		System.out.println(names);
		names.removeAll(names);
		System.out.println(names);
	}
}