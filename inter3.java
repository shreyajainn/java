interface Drawable{  
default void Drawable()
{
System.out.println("it is construcyor of interface");
}
void draw();  
default void msg(){System.out.println("default method");}  
}  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class inter3{  
public static void main(String args[]){  
Drawable d=new Rectangle();  
d.draw();  
d.msg();  
}} 