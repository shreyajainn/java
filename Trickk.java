import java.util.Scanner;
import java.util.Random;
class Trickk
{
public static void main(String a[])
{
double span=0.32;
double offset=7.0 - span * ('P' - 'A');
for(char c= 'A';c<= 'Z';c++)
{double val = offset+span * (c - 'A');
int key = (int)val;
System.out.printf("%s %d",c,key);
}
}
}

