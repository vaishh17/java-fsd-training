import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
class QueueString
{
	public static void main(String[] args)
	{
		Queue<String>q=new LinkedList<>();
		q.add("Hello");
		q.add("Welcome");
		q.add("To");
		q.add("World");
		q.add("Of");
		q.add("Java");
		System.out.println("The Queue elements are: "+q);
		String head=q.peek();
		System.out.println("The head of queue is: "+head);
		String remove=q.remove();
		System.out.println("The Queue elements are: "+q);
		System.out.println("The Size of Queue elements are: "+q.size());
		
		ArrayList<String>fruits=new ArrayList<String>();
		fruits.add("Strawberry");
		fruits.add("Blueberry");
		System.out.println("Collection to be added: "+fruits);
		q.addAll(fruits);
		System.out.println("Collection to be added: "+q);
	}
}