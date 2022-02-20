import java.util.Scanner;
class Assignment
{
	public static void bubbleSort(int arr[], int len)
	{ 
		 int temp;
		for (int i = 0; i < len-1; i++) 
			for (int j = 0; j < len-i-1; j++)
			{
				if (arr[j] > arr[j+1])
				{
					
				    temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		int arr2[]=new int[size];
		int arr3[]=new int[size];
		int count=0;
		System.out.println("enter the first array elements");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter the Second array elements");
		for(int i=0;i<size;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		for(int x=0;x<size;x++)
		{
			for(int y=0;y<size;y++)
			{
				if(arr1[x]==arr2[y])
				{
					arr3[count]=arr2[y];
					count++;
				}
			}
		}
		bubbleSort(arr3,count);
		System.out.println("3rd array elements are");
