interface Animals
{
 void function1();
 void function2();
}
class Fish implements Animals
{
public void function1()
{
System.out.println("Fish can swim");
}
public void function2()
{
System.out.println("Fish is swimming");
}
}
public class Test
{
public static void main (String[] args)
{
Fish a = new Fish();
a.funtion1();
a.funtion2();
}
}

