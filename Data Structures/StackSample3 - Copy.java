import java.util.Stack;
class StackSample3
{
	public static void main(String[] args)
	{
		Stack<Character> stk=new Stack<>();
		stk.push('J');
		stk.push('A');
		stk.push('V');
		stk.push('A');
		System.out.println("Stack Elements are: "+stk);
		boolean result=stk.empty();
		System.out.println("Is the stack empty: "+result);
		stk.pop();
		stk.push('D');
		System.out.println("The new stack elements are: "+stk);
		System.out.println("The last element is: "+stk.peek());
		System.out.println("The position of J is: "+stk.search('J'));
		
	}
}