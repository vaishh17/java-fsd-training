class BinarySearchPractice
{
	public static int binarysearch(int a[],int begin,int end,int val)
	{
		int mid;
		if(end>=begin)
		{
			mid=begin+end/2;
			if(a[mid]==val)
			{
			return mid+1;
			}
			else if(a[mid]<val)
			{
			return binarysearch(a,mid+1,end,val);
			}
			else
			{
			return binarysearch(a,begin,mid-1,val);
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		int val=90;
		int n=a.length;
		int res=binarysearch(a,0,n-1,val);
		System.out.println("Enter the elements into the array");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+ ", ");
		}
		System.out.println("Element to be searched is " +val);
		if(res==-1)
		{
		System.out.println("The element is not present at index ");
		}
		else
		{
		System.out.println("The element is found at" +res+ " position of array");
		}
		
	}
}
