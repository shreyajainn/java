import java.util.Scanner;
import java.util.*;
class alternate1
{
public static void main(String a1[])
{
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int[]arr = new int[a];
int[]t = new int[100];
int[]ar = new int[100];
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
int i=0,p=0,km=0;
while(i<j && p<l)
{
ar[km++]=k[i++];
ar[km++]=t[p++];
}
while(i<j)
{
ar[km++]=k[i++];
}
while(p<l)
{
ar[km++]=t[p++];
}
for(int i1=0;i1<km;i1++)
{
System.out.println(ar[i1]);
}
}
}

