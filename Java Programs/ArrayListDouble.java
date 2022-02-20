import java.util.*;
class ArrayListDouble
{
	public static void main(String[] args)
	{
		ArrayList<Double>num=new ArrayList<Double>();
		num.add(30.65);
		num.add(15.00);
		num.add(385.68);
		num.add(05.67);
		System.out.println("The ArrayList Elements are: " +num);
		Collections.sort(num);
		Collections.reverse(num);
		System.out.println("The ArrayList Elements after sorting are: " +num);
	}
}