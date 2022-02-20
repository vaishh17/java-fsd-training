import java.util.LinkedList;
import java.util.Queue;
class QueueChar
{
	public static void main(String[] args)
	{
		Queue<Character>q=new LinkedList<>();
		q.add('a');
		q.add('e');
		q.add('i');
		System.out.println("The Queue elements are: "+q);
		char head=q.peek();
		System.out.println("The head of queue is: "+head);
		char remove=q.remove();
		System.out.println("The Queue elements are: "+q);
		System.out.println("The Size of Queue elements are: "+q.size());
	}
}