import java.util.Scanner;
public class account {
	
		int accNum;
		double balance;
	 account(int num , double bal) {
		accNum = num;
		balance = bal;
	}
	account(int num){
		accNum=num;
		balance=0.0;
	}
	int getAccountNumber() {
		return accNum;
	}
	double getBalance() {
		return balance;
	}
	void  setBalance(double bal) {
		balance = bal;
	}
	void credit (double amount) {
		balance+=amount;
	}
	void debit(double am) {
		if(balance >= am)
			balance-=am;
		else
			System.out.println("amount withdrawn exceeds the current balance!");
	}

	
public static void main(String a1[])
{
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
double d=sc.nextDouble();
account a=new account(b,d);
int t1=sc.nextInt();
switch(t1)
{
case 1:
{
double p=sc.nextDouble();
a.credit(p);
break;
}
case 2:
{
double t =sc.nextDouble();
a.debit(t);
break;
}
default:
System.out.println("Account closed");
}
System.out.println(a.getBalance());
}




}
	

