import java.util.LinkedList;
import java.util.Queue;
class QueueDoub
{
	public static void main(String[] args)
	{
		Queue<Double>q=new LinkedList<>();
		q.add(11.5);
		q.add(100.20);
		q.add(123.456);
		q.add(22.222);
		System.out.println("The Queue elements are: "+q);
		double head=q.peek();
		System.out.println("The head of queue is: "+head);
		double remove=q.remove();
		System.out.println("The Queue elements are: "+q);
		System.out.println("The Size of Queue elements are: "+q.size());
	}
}