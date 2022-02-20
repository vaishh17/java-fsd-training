import java.util.*;
class Attendance
{
public static void main(String[] args)
{
System.out.println("Enter the number of classes held ");
Scanner a = new Scanner (System.in);
int x = a.nextInt();
System.out.println("Enter the number of classes attended ");
Scanner b = new Scanner (System.in);
int y = b.nextInt();
float z = ((y*100)/x);
if(z<=75)
{
System.out.println("Not Eligible for the exam");
}
else
{
System.out.println("Eligible for the exam");
}
}
}


