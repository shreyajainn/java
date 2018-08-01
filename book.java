import java.util.Scanner;
class Author
{
	String name;
	String email;
	char gender;
Author()
{}
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
	this.email=mail;
}
char getgender()
{
	return gender;
}
String toString2()
{
	String str="Author"+this.name+"\n"+"email"+this.email+"\n"+"gender"+this.gender;
	return str;
}

}

class book {
	String bname;
	double bprice;
	int bqty;
	Author bauthor;
book(String name,Author author,double price)
{
	this.bname=name;
	this.bauthor=author;
	this.bprice=price;
}
book(String name,Author author,double price,int qty)
{
	this.bname=name;
	this.bauthor=author;
	this.bprice=price;
	this.bqty=qty;
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
String toString1()
{
	String ptr="BOOK"+this.bname+"\n"+"author"+this.bauthor.toString2()+"\n"+"quantity"+this.bqty+"\n"+"price"+this.bprice;
	return ptr;
}
public static void main(String a1[])
{

	Scanner sc=new Scanner(System.in);
	Author a=new Author("shreya","DSfgdf",'m');
	book b=new book("java",a,100);
	book b2=new book("java",a,100,3);
	System.out.println("author details"+a.toString2());
	System.out.println("book details"+b2.toString1());
}
}








