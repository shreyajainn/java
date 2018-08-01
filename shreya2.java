import java.util.Scanner;
public class account {
	private 
		int accNum;
		double balance;
	public
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
		if(balance >= am);
			balance-=am;
		else
			System.out.println("amount withdrawn exceeds the current balance!");
	}

	}
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
int b=sc.nextInt();
dounble d=sc.nextDouble();
account a=new account(b,d);
a.getAccountNumber();
a.getBalance();
a.setBalance();
int t=sc.nextInt();
switch(t)
{
case 1:
{
double p=nextDouble();
a.credit(p);
break;
}
case 2:
{
double t =newDouble();
a.debit(t);
break;
}
default:
System.out.println("Account closed");
}
System.out.println(bal,num);
}




}
	
}
