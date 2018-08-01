import java.util.Scanner;
class repeat
{
public static void main(String a1[])
{
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int flag=0;
int k=0;
int[]arr=new int[a];
for(int i=0;i<a;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<a;i++)
{
for(int j=i+1;j<a;j++)
{
if(arr[i]==arr[j])
{
k=arr[i];
flag=1;
break;
}}
if(flag==1)
{break;
}}
System.out.println(k);
}
}
