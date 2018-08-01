import java.util.Scanner;
class duplicate
{
public static void main(String a1[])
{
Scanner sc = new Scanner(System.in);
int a= sc.nextInt();
int []ar= new int[a];
for(int i=0;i<a;i++)
{
ar[i]=sc.nextInt();
}
for(int i=0;i<a;i++)
{
for(int j=0;j<i;j++)
{
if(ar[i]==ar[j])
{
ar[i]=0;
}
}
}
for(int i=0;i<a;i++)
{
System.out.println(ar[i]);
}
}
}