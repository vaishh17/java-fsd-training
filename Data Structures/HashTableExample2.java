import java.util.Hashtable;
import java.util.Map;
class HashTableExample2
{
	public static void main(String[] args)
	{
		Hashtable<String, Character>alpha=new Hashtable<>(10);
		alpha.put("Blue", 'b');
		alpha.put("Red", 'r');
		alpha.put("Orange", 'o');
		alpha.put("Magenta", 'm');
		alpha.put("Pink", 'p');
		for(Map.Entry<String, Character>e : alpha.entrySet())
			System.out.println("The Key of alpha is: "+e.getKey() + " and the Value of alpha is: "+e.getValue());
		System.out.println(" ");
		Hashtable<String,Integer>map=new Hashtable<>(5,0.75f);
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		map.put("Six", 6);
		System.out.println(map);
		System.out.println(" ");
		
		Hashtable<String, Character>m=new Hashtable<>(alpha);
		System.out.println(m);
		m.putIfAbsent("Purple", 'p');
		System.out.println(m);
		System.out.println(" ");
		
		System.out.println("Size of alpha is: "+alpha.size());
		System.out.println("Size of map is: "+map.size());
		System.out.println("Size of m is: "+m.size());
		
	}
}
