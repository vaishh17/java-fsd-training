class MySelectionSort
{
	void selectionsort(int arr[])
	{
		int n=arr.length;
		int temp;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
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
		MySelectionSort ob=new MySelectionSort();
		int arr[]= {64,25,12,22,11};
		ob.selectionsort(arr);
		System.out.println("Sorted Array is: ");
		ob.printArray(arr);
	}
}