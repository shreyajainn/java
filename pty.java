abstract class as
{  
   abstract void run();
} 
class p extends as
{
void run()
{
System.out.println("hdf");
}
}
class pty
{
public static void main(String a1[])
{
as a = new p();
a.run(); 
}
}