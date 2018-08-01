import java.util.Scanner;
class sorte
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
int large=ar[0],small=ar[0];
for(int i=0;i<a;i++)
{
for(int j=i+1;j<a;j++)
{
if(ar[i]>large)
{
large=ar[i];
}
}
}
for(int i=0;i<a;i++)
{

if(ar[i]<=small)
{
small=ar[i];

}
}
System.out.printf("%d",large);
System.out.printf("%d",small);
}
}