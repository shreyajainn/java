import java.util.Scanner;
public class super1
{
super1()
{
System.out.println("super constructor");
}
void add()
{
System.out.println("super ka function");
}
};
public class st extends super1{
st()
{
System.out.println("st constructor");
}
void add()
{
System.out.println("add inherited");
}
public static void main(String a[])
{
st s=new st();
st.add();
super.add();
}
}
