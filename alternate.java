import java.util.Scanner;
class alternate
{
public static void main(String a1[])
{
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int[]arr = new int[a];
int[]t = new int[100];
int[]k = new int[100];
int l=0,j=0;
for(int i=0;i<a;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<a;i++)
{
if(arr[i]>0)
{
k[j]=arr[i];
j++;
}
else
{
t[l]=arr[i];
l++;
}
}
for(int i=0;i<j;i++)
{

for(int p=0;p<l;p++)
{
if(i==p)
{
System.out.println(k[i]);
System.out.println(t[p]);
}
}
}
}
}
