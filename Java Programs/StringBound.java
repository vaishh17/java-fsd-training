class StringBound
{
	public static void main(String[] args)
	{
		String str="Welcome to the world of java";
		try {
		str.charAt(30);
		System.out.println("Index word found");
		}catch(Exception e)
		{
		System.out.println("Index word not found");
	}
		System.out.println(str.charAt(27));
}
}