import java.util.*;
class BubbleSort1
{
	void bubblesort(int arr3 [])
	{
		int n=arr3.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr3[j]>arr3[j+1])
				{
					int temp=arr3[j];
					arr3[j]=arr3[j+1];
					arr3[j+1]=temp;
				}
			}
		}
	}
	void printArray(int arr3[])
	{
		int n=arr3.length;
		for(int i=0;i<n;i++)
		{
		System.out.print(arr3[i]+ " ");
		}
		
	}
	public static void main(String[] args)
	{
		int count=0;
		System.out.println("Enter the Size of Array : ");
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int arr1[]=new int[size];
		int arr2[]=new int[size];
		int arr3[]=new int[size];
		System.out.println("Enter the elements of Array 1");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the elements of Array 2");
		for(int i=0;i<size;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		//Checking for Similar Elements//
		System.out.println("Similar Elements is: ");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(arr1[i]==arr2[j])
				{
					
					arr3[count]=arr1[i];
					count++;
				}
			}
		}
		//Sorting//
		BubbleSort1 ob=new BubbleSort1();
		ob.bubblesort(arr3);
		System.out.println("Sorted Array");
		ob.printArray(arr3);
		
	}
}