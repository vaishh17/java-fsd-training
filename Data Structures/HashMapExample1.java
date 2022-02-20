import java.util.HashMap;
class HashMapExample1
{
	public static void main(String[] args)
	{
		HashMap<String, Integer>map= new HashMap<>();
		map.put("John",1);
		map.put("Sam",2);
		map.put("George",3);
		map.put("Jessica", 4);
		System.out.println("The Initial Map values are: "+map);
		map.put("George",5);
		System.out.println("The New Map List is: "+map);
		if(map.containsKey("John"));
		Integer a=map.get("John");
		System.out.println(a);
		map.putIfAbsent("Ann", 6);
		System.out.println(map);
		
	}
}

