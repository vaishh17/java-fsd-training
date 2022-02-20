import java.util.*;
class Array
{
public static void main(String[] args)
{
System.out.println("Enter the size of array 1 ");
Scanner sc = new Scanner(System.in);
int a= sc.nextInt();
int[] p = new int [a];
System.out.println("Enter the elements of array 1 ");
for(int i=0;i<a;i++)
{
p[i]=sc.nextInt();
}
System.out.println("The elements are ");
for(int i=0;i<a;i++)
{
System.out.println(p[i]);
}
System.out.println("Enter the size of array 2 ");
int b= sc.nextInt();
int[] q=new int[b];
System.out.println("enter the elements of array 2");
for(int i=0;i<b;i++)
{
q[i]=sc.nextInt();
}
System.out.println("The elements are ");
for(int i=0;i<b;i++)
{
System.out.println(q[i]);
}
}
}
