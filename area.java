import java.util.*;
class ObjectShape
{
    double a;
    void display()
    {
        double r;
        double pi = 3.14;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter radius of a circle : ");
        r=in.nextDouble();
        System.out.println("value of r : (in display func)"+r);
        a=2*pi*r;
    }
}
class Circle extends ObjectShape
{
    void areaII()
    {
       System.out.println("extended class a : "+a);
    }
}
public class area
{
    public static void main(String args[])
    {
        Circle c=new Circle();
        c.display();
        c.areaII();
    }
}