class MyBubbleSort
{
	void bubblesort(int arr[])
	{
		int n=arr.length;
		int temp;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			}
		}
		}
		void printArray(int arr[])
		{
			int n=arr.length;
			for(int i=0;i<n;++i)
			{
			System.out.print(arr[i]+ " ");
			}
			System.out.println();
		}
	
	
	public static void main(String[] args)
	{
		MyBubbleSort ob=new MyBubbleSort();
		int arr[]= {10,856,20,7};
		ob.bubblesort(arr);
		System.out.println("Sorted Array is ");
		ob.printArray(arr);
		
		
		
		
	}
}