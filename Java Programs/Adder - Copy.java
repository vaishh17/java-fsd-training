class Adder
{
static int add(int a, int b)
{
return a+b;
}
static int add(int a, int b, int c)
{
return a+b+c;
}
class MethodOver
{
public static void main(String args[])
{
System.out.println(Adder.add(2,3));
System.out.println(Adder.add(2,1,1));
}
}
}