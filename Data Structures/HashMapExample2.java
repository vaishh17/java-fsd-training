import java.util.HashMap;
class HashMapExample2
{
	public static void main(String[] args)
	{
		HashMap<Integer,String>map1=new HashMap(10);
		HashMap<Integer,String>map2=new HashMap(2);
		map1.put(1, "One");
		map1.put(2, "Two");
		map1.put(3, "Three");
		
		map2.put(4, "Bangalore");
		map2.put(5, "Chennai");
		map2.put(6, "Hyderabad");
		
		System.out.println("The Map1 contains: "+map1);
		System.out.println("The Map2 contains: "+map2);
	}
}