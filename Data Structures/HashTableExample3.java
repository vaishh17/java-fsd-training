import java.util.Hashtable;
class HashTableExample3
{
	public static void main(String[] args)
	{
		Hashtable<Integer,Double>m=new Hashtable<>(10);
		m.put(10, 10.1);
		m.put(20, 1698.546);
		m.put(30, 12.34);
		System.out.println(m);
		if(m.contains(20));
		Double a=m.get(20);
		System.out.println(a);
	}
}