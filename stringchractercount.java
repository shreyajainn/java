import java.util.Scanner;
class arr
{
public static void main(String a1[])
{
Scanner sc =new Scanner(System.in);
String a=sc.nextLine();
int count[]=new int[80];
int len =a.length();
for(int i=0;i<len;i++)
{
	   
        count[a.charAt(i)]++;
}
for(int i=0;i<len;i++)
{
	 if(count[a.charAt(i)]>1)
	   {
		 System.out.println("REAPTED ELEMENT IS"+a.charAt(i));  
		}
}
}
}