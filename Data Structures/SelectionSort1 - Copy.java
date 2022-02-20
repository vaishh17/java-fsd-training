import java.util.*;
class SelectionSort1
{
	public void sort(int sum[])
	{
		int n=sum.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(sum[j]<sum[min])
				{
					min=j;
				}
				int temp=sum[min];
				sum[min]=sum[i];
				sum[i]=temp;
			}
		}
	}
	void printArray(int sum[])
	{
		int n=sum.length;
		for(int i=0;i<n;++i)
		{
		System.out.print(sum[i]+ " ");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the size of array ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr1[]=new int[size];
		System.out.println("Enter the Elements of Array 1");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int arr2[]=new int[size];
		System.out.println("Enter the Elements of Array 2");
		for(int i=0;i<size;i++)
		{
			arr2[i]=sc.nextInt();
		}
		System.out.println("The Sum of two Arrays are");
		int sum[]=new int[size];
		for(int i=0;i<size;i++)
		{
			sum[i]=arr1[i]+arr2[i];
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(sum[i]);
		}
		//Sorting//
		SelectionSort1 ob=new SelectionSort1();
		ob.sort(sum);
		System.out.println("Sorted Array");
		ob.printArray(sum);
		
	}
}