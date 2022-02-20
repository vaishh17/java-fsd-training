import java.util.Scanner;
class LinearSearchPractice
{
	public static void linearsearch(int []arr,int size,int num)
	{
		int count=-1;
		for(int i=0;i<size;i++)
		{
			if(num==arr[i])
			{
				System.out.println("The number " +num+ " is present at index "+i);
				count++;
			}
		}
		if(count==-1)
		{
			System.out.println("The number not present");
		}
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Enter the size of array ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the Array Elements");
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int num=sc.nextInt();
		linearsearch(arr,size,num);
	}
		
}
