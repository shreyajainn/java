import java.util.Scanner;
public class Author
{
String name;
String email;
char gender;
Author(String name1,String email1,char gender1)
{
this.name=name1;
this.email=email1;
this.gender=gender1;
}
String getName()
{
return name;
}
String getEmail()
{
return email;
}
void setemail(String mail)
{
email=mail;
}
char getgender()
{
return gender;
}
}
public class book extends Author{
String bname;
double bprice;
int bqty;
Author bauthor;
book(String name,Author author,double price)
{
bname=name;
bauthor=author;
bprice=price;
}
book(String name,Author author,double price,int qty)
{
bname=name;
bauthor=author;
bprice=price;
bqty=qty;
}
String getname()
{
return bname;
}
Author getauthor()
{
return bauthor;
}
Double getprice()
{
return bprice;
}
void setprice(Double price)
{
this.bprice=price;
}
int getqty()
{
return bqty;
}
void setqty(int qty)
{
this.bqty=qty;
}
public static void main(String a1[])
{
String name;
String email;
char gender;
String bname;
double bprice;
int bqty;
Author bauthor;
Scanner sc=new Scanner(System.in);
Author a=new Author();
name=a.nextLine();
email=a.nextLine();
gender=a.nextChar();
super(name,email,gender);
book b=new book();
bname=b.nextLine();
bprice=b.nextDouble();
bqty=b.nextInt();
bauthor=NULL;
book(bname,bauthor,bprice);
book(bname,bauthor,bprice,bqty);
System.out.println("author details");
System.out.println(getname()+" "+getemail()+" "+getgender);
}
}







