import java.util.Scanner;
class pair
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
System.out.println("ENTER PARTICULAR SUM");
int sum=sc.nextInt();
for(int i=0;i<a;i++)
{
for(int j=0;i<a;j++)
{
if((i+j)==sum)
{
System.out.printf("%d %d",i,j);
break;
}
}
}
}
}