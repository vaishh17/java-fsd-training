class Car
{
public void speed()
{
System.out.println("The speed is 80km/hr");
}
class Audi extends Car
{
public void speed()
{
System.out.println("The speed is 120km/hr");
}
public static void main(String args[])
{
Car c=new Audi();
c.speed();
}
}
}