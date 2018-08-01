import java.util.Scanner;
class super1
{
super1()
{
System.out.println("super constructor");
}
void add()
{
System.out.println("super ka function");
}
public static void main(String args[])
{
st s=new st();
s.work();

}
}
class st extends super1{
st()
{
System.out.println("st constructor");
}
void add()
{
System.out.println("add inherited");
}
void work()
{
add();
super.add();
}


}


