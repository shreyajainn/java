import java.util.*;
abstract class Bike{  
  abstract void run();  
}  
class Ho extends Bike{  
void run(){System.out.println("running safely..");}  
public static void main(String args[]){  
 Bike obj = new Ho();  
 obj.run();  
}  
}  