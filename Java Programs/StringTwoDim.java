import java.util.*;
class StringTwoDim
{
	public static void main(String[] args)
	{
		int i=0,j=0;
		System.out.println("Enter the row and col size ");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		String[][] names=new String[row][col];
		int[][] marks=new int[row][col];
		System.out.println("Enter the names of students: ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				names[i][j]=sc.next();			
			}
		}
		System.out.println("Enter the marks ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				marks[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the name of student whose marks it to be checked:  ");
		String a=sc.next();
		try {
		if(names[i][j]==(a));
		{
		
			if(marks[i][j]>=400)
			{
				System.out.println("The student has passed the exam ");
			}
			else
			{
				System.out.println("The student has failed the exam");
			}
		
	}
}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}