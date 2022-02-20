import java.util.*;
class ArraySorting
{
	public static void main(String[] args)
	{
		ArrayList<String> fruits=new ArrayList<String>();
		fruits.add("Raspberry");
		fruits.add("Pomogranate");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		System.out.println("This Array list contains fruits such as: " +fruits);
		Collections.sort(fruits);
		System.out.println("The Updated List After Sorting is: " +fruits);
		System.out.println("The size of this Array is: " +fruits.size());

		
	
}
}