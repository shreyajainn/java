import java.util.Scanner;
class array2
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int sum;
int[]p=new int[5];
for(int i=0;i<5;i++)
{
p[i]=sc.nextInt();
}
sum=sc.nextInt();
for(int i=0;i<5;i++)
{
int first=p[i];
for(int j=i+1;j<5;j++)
{
int second=p[j];
if((first+second)==sum)
{
System.out.printf(("%d,%d"),first,second);

}
}}
}}
