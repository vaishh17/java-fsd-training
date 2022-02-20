import java.util.Stack;
class StackSample4
{
	public static void main(String[] args)
	{
		Stack<String> stk=new Stack<>();
		stk.push("Dog");
		stk.push("Cat");
		stk.push("Lion");
		stk.push("Tiger");
		System.out.println("Stack Elements are: "+stk);
		boolean result=stk.empty();
		System.out.println("Is the stack empty now: "+result);
		stk.pop();
		System.out.println("New Stack Elements are: "+stk);
		System.out.println("The last element is: "+stk.peek());
		System.out.println("The position of Dog is: "+stk.search("Dog"));
		System.out.println("The position of Tiger is: "+stk.search("Tiger"));
	}
}