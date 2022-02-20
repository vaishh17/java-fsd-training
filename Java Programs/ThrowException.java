class ThrowException
{
	public static void greater(int a)
	{
		if(a>30)
		{
			throw new 	ArithmeticException("yes, a is greater than b");
		}
		else
		{
			System.out.println("a is less than 30");
		}
	}
	public static void main(String[] args)
	{
		try{
			greater(55);
		}catch(ArithmeticException e)
		{
		System.out.println(e);
	}
		
}
}