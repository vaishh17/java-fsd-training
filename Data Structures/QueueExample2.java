import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
class QueueExample2
{
	public static void main(String[] args)
	{
		Queue<Integer>q=new LinkedList<>();
		for(int i=0;i<=5;i++)
		{
			q.add(i);
		}
		System.out.println("Elements in queue: "+q);
		int removedel=q.remove();
		System.out.println(removedel);
		System.out.println("The Queue after removing elements: "+q);
		System.out.println("The size of queue is: "+q.size());
		System.out.println("Does the Queue contain 5?: "+q.contains(5));
		System.out.println("Is the queue empty ?"+q.isEmpty());
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("Collection to be added: "+list);
		boolean res=q.addAll(list);
		System.out.println("Collection to be added: "+q);
		
		
	}
}