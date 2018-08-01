interface book
{
void print();
}
class A implements book
{
public void print()
{
System.out.println("Hello");
}

public static void main(String a1[])
{
A obj =new A();
obj.print();
}
}