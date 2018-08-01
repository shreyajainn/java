import java.util.Scanner;
public class array
{
public static int large(int[] a,int size)
{
int temp;
for(int i=0;i<size;i++)
{
for(int j=i+1;j<size;i++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
return a[size-1];
}
public static void main(String args[])
{
int a1[]={6,2,7,1,5};
int k=large(a1,6);
System.out.println(k);
}}