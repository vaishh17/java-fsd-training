import java.util.HashMap;
class HashMapExample5
{
	public static void main(String[] args)
	{
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println("Mapping1: " +map);
        
        HashMap<Integer,String>map2=new HashMap<>(map);
        System.out.println("Mapping2: "+map2);
    }
}
