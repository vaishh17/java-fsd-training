import java.util.*;
class A
{
public static void main(String[] args)
{
System.out.println("Enter the array size");
Scanner sc = new Scanner(System.in);
int p = sc.nextInt();
int[]arr = new int[p];
System.out.println("Enter the elements");
for(int i=0; i<p;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("The values are");
for(int i=0; i<p;i++)
{
System.out.println(arr[i]);
}
}
}