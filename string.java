import java.util.Scanner;
public class string{
public static void main(String args[])
{
Scanner sc1=new Scanner(System.in);
String sc=new String("banana");

String output=new String(5);


for(int i=0;i<sc.length();i++)
{
for(int j=0;j<output.length();j++)
{
if(sc.charAt(i)!=output.charAt(j))
{
output=output+sc.charAt(i); 

}
}
}
System.out.println(output);
}
}

