interface s1
{
	void print();
}
interface s2 
{
	void print();
}
class d implements s2,s1
{
public void print()
{
System.out.println("hey");
}}
class inter2
{
public static void main(String a[])
{
d a1=new d();
a1.print();
}
}