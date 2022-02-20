class Electronics 
{
public Electronics()
{
System.out.println("Class Electronics");
}
public void deviceType() 
{
System.out.println("Device Type: Electronics");
}
}
class Mobile extends Electronics 
{
public Mobile() 
{
System.out.println("Class Mobile");
}
public void category() 
{
System.out.println("Category - Mobile");
}
}
class Smartphone extends Mobile 
{
public Smartphone() 
{
System.out.println("Class LED");
}
public void display_tech() 
{
System.out.println("Display Technology- Smartphone");
}
}
public class Tester
{
public static void main(String[] arguments) 
{
Smartphone p = new Smartphone();
p.deviceType();
p.category();
p.display_tech();
}
}