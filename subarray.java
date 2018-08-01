import java.util.Scanner;
import java.util.HashMap;
class subarray{
public static void main(String a1[])
{
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int[]arr=new int[a];
for(int i=0;i<a;i++)
{
arr[i]=sc.nextInt();
}

HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
         
    
        int sum = 0;     
         
     
        for (int i = 0; i < arr.length; i++)
        { 
        
            sum += arr[i];
             if (arr[i] == 0 || sum == 0 || hM.get(sum) != null)                         
               System.out.println("true");
             	hM.put(sum, i);
        } 
     System.out.println("False");
    
}
}    
