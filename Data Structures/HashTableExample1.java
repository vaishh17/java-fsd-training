import java.util.Hashtable;
import java.util.Map;
class HashTableExample1
{
	public static void main(String[] args)
	{
		Hashtable<Double, Character>map=new Hashtable<>();
		map.put(1.1, 'a');
		map.put(2.5,'e');
		map.put(1.2, 'i');
		map.put(5.5, 'o');
		map.put(10.0, 'u');
		System.out.println("The Hashtable Elements are: "+map);
		System.out.println("Size of hashtable is: "+map.size());
		if(map.contains(1.1));
		Character x=map.get(1.1);
		System.out.println("The value of 1.1 is: "+x);
		map.remove(10.0);
		System.out.println("Elements present after invoking remove method: "+map);
		for(Map.Entry<Double,Character>e:map.entrySet())
		System.out.println("The Key is: "+e.getKey() + " and the Value is: "+e.getValue());
	}
}
