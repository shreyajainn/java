import java.util.Scanner;
public class anagram
{
String name;
String name2;
int flag=0;
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
name2=sc.nextLine();
int i,j;
for(i=0;i<name.length;i++)
{
flag=0;
for(j=0;j<name2.length;j++)
{
if(name.charAt(i)==name2.charAt(j))
{
flag=1;
}
}
if(flag==0)
{
break;
}
}
if(flag==1)
{
System.out.println("anagram");
}
else
{
System.out.println("not anagram");
}
}}
