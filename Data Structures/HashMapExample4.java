import java.util.HashMap;
import java.util.Map;
class HashMapExample4
{
	public static void main(String[] args)
	{
		HashMap<String,Integer>city=new HashMap<>(5,0.75f);
		city.put("Bangalore", 5);
		city.put("Chennai", 10);
		city.put("Mumbai", 15);
		city.put("Kolkata", 20);
		city.put("Delhi", 25);
		city.put("Hyderabad", 30);
		System.out.println("Mappings are: "+city);
		

//Using for-each loop//
		for(Map.Entry<String,Integer>e: city.entrySet())
			System.out.println("The Key is: "+e.getKey()+ " and the Value is:  "+e.getValue());
	}
}