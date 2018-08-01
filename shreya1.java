import java.util.Scanner;
class Circle
{
private
double radius;
String color;
public
Scanner sc=new Scanner(System.in);
Circle()
{
radius=1.0;
color="red";
}
Circle(double p)
{
radius=p;
color=sc.nextLine();
}
double getRadius()
{
return radius;
}
double getArea()
{
double area;
area=3.14*getRadius()*getRadius();
return area;
}

public static void main(String a[])
{
Scanner sc1=new Scanner(System.in);
double p;
p=sc1.nextDouble();
Circle s1=new Circle(p);
System.out.println(s1.getArea());
sc1.close();
}
}

