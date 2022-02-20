import java.util.HashMap;
import java.util.Map;
class HashMapExample3
{
	public static void main(String[] args)
	{
		HashMap<Integer, String>map1=new HashMap<>(5,0.75f);
		map1.put(1, "One");
		map1.put(2, "Two");
		map1.put(3, "Three");
		
//Another way of declaring the HashMap//
		HashMap<Integer,String>map2;
		map2=new HashMap<>(3,0.5f);
		map2.put(4, "Bangalore");
		map2.put(5, "Chennai");
		map2.put(6, "Hyderabad");
		map2.put(7, "Kochi");
		
		System.out.println("Mappings of map1: "+map1);
		System.out.println("Mappings of map2: "+map2);
		System.out.println("Size of map1: "+map1.size());
		System.out.println("Size of map2: "+map2.size());
		
		if(map1.containsKey(4));
		String a=map1.get(4);
		System.out.println(a);
		
		map1.put(1, "Good");
		System.out.println(map1);
		
		for(Map.Entry<Integer,String>e:map2.entrySet())
			System.out.println("The Key is: "+e.getKey() + " and the value is: "+e.getValue());
	
			
		
		
	}
}