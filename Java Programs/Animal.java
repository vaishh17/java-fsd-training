abstract class Animal
{
public void sound()
{
System.out.println("Hey");
}
abstract public void sound2();
}
class Dog extends Animal
{
public void sound2()
{
System.out.println("Animals noise");
}
public static void main(String[] args)
{
Dog obj = new Dog();
obj.sound2();
}
}
