import java.util.PriorityQueue;
class PriorityQueueInt
{
	public static void main(String[] args)
	{
		PriorityQueue<Integer>num=new PriorityQueue<>();
		num.add(10);
		num.add(100);
		num.add(5);
		num.add(1);
		System.out.println("The list: "+num);
		System.out.println("Head is: "+num.peek());
		num.add(2);
		System.out.println("New list: "+num);
		num.remove();
		System.out.println(num);
		System.out.println("Head is: "+num.peek());
		
	}
}