import java.util.Scanner;
import java.util.Random;
class Trickkk
{
public static void main(String a[])
{
Random r=new Random();
int num=r.nextInt(26);
System.out.println(num);
System.out.println((char)(num+96));
char p=(char)(num+96);
num+=2;
int key=num/3 +1;
if((num==21)||(num==28))
key--;
System.out.println("Keypad output" + key);
}
}

