import java.util.Scanner;
class Sorted
{
public static void main(String a[])
{
Scanner sc = new Scanner(System.in)
int a= sc.nextInt();
int []ar= new Int[a]
for(int i=0;i<a;i++)
{
ar[i]=sc.nextInt();
}
int large,small;
for(int i=0;i<a;i++)
{
if(ar[i]>ar[j])
{
large=a[i];
}

}
for(int i=0;i<a;i++)
{
for(jint =i+1;j<a;j++)
{
if(ar[i]<ar[j])
{
small=a[i];
}
}
}
System.out.println(large);
System.out.println(small);
}
}