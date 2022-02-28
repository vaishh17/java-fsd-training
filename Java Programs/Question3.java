package com.ust;

public class Question3 
{

	public static void main(String[] args) 
	{
		try
		{
			int Initial = 500;
			int Balance = 0;
			System.out.println(" "+(Initial/Balance));
		}catch(ArithmeticException e)
		{
			System.out.println("Oops! There seem to be an Arithemtic Exception" +e);
		}
		finally
		{
			System.out.println("Finally block is executed");
		}
		
	}

}










