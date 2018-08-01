interface A
{
void a();
void b();
void c();
void d();
}
abstract class D implements A
{
public void c()
{
System.out.println(" i m in c");
} 
}
class B extends D
{
public void a()
{
System.out.println(" i m in a");
}public void b()
{
System.out.println(" i m in b");
}public void d()
{
System.out.println(" i m in d");
}
}
class test1
{
public static void main(String a1[])
{
A a =new B();
a.c();
a.a();
a.b();
a.d();
}
}

