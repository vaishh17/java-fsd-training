import java.util.*;
class ArrayListInt
{
	public static int sumOfArray(Integer a[], int n)
	{
	if(n==0)
	{
		 return a[n];
	}
	else
	{
		return a[n]+sumOfArray(a,n-1);
	}
	}
	public static void main(String[] args)
	{
		ArrayList<Integer>num=new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		System.out.println("The ArrayList contains Integer numbers such as: "+num);
		
		System.out.println("Coverting the ArrayList to an Array");
		Integer a[]=new Integer[num.size()];
		num.toArray(a);
		
		for(Integer obj:a)
		{
			System.out.println(obj+ " ");
		}
		int sum= sumOfArray(a,a.length-1);
		System.out.println("The sum of Array is: "+sum);
		float avg=sum/num.size();
		System.out.println("The average of Array is: "+avg);
		
	}
}