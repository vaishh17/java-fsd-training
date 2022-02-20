import java.util.Stack;
class StackSample2
{
	public static void main(String[] args)
	{
		Stack<Double> stk=new Stack<>();
		boolean result=stk.empty();
		System.out.println("Is the stack empty? "+result);
		stk.push(12.24);
		stk.push(100.458);
		stk.push(12345.678);
		stk.push(10.00);
		stk.push(35.65);
		System.out.println("Stack Elements are: "+stk);
		result=stk.empty();
		System.out.println("Is the stack empty now: "+result);
		stk.pop();
		stk.pop();
		System.out.println("New Stack Elements are: "+stk);
		System.out.println("The last element is: "+stk.peek());
		System.out.println("The position of 100.458 is: "+stk.search(100.458));
		System.out.println("The position of 10.00 is: "+stk.search(10.00));
		
	}
}