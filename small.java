import java.util.Scanner;
import java.util.*;
class small
{
public static void main(String a1[])
{
Scanner sc = new Scanner(System.in);
int a= sc.nextInt();
int []ar= new int[a];
int temp;
for(int i=0;i<a;i++)
{
ar[i]=sc.nextInt();
}

System.out.println("enter ith element");
int k1=sc.nextInt();
int small=ar[0];
int l=0;
do
{
 small=ar[0];
for(int i=0;i<a;i++)
{
if(ar[i]<=small)
{
small=ar[i];
}
}
for(int j=0;j<a;j++)
{
if(ar[j]==small)
{
for(int k=j;k<a-1;k++)
{
temp =ar[k];
ar[k]=ar[k+1];
}
}
a--;}
k1--;
}while(k1!=0);
System.out.printf("%d",small);
}
}