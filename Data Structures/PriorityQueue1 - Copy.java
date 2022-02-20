import java.util.PriorityQueue;
class PriorityQueue1
{
	public static void main(String[] args)
	{
		PriorityQueue<String>names=new PriorityQueue<>();
		names.add("Dhoni");
		names.add("Ann");
		names.add("Bob");
		System.out.println("The list: "+names);
		System.out.println("Head is: "+names.peek());
		names.add("Annie");
		System.out.println("New list: "+names);
		names.remove();
		System.out.println(names);
		System.out.println("Head is: "+names.peek());
		
	}
}