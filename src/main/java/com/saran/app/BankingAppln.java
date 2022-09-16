package com.saran.app;

public class BankingAppln {
	
	int accountNo;
	String accountName;
	float amount;
	
	void insertAccount(int accountNo,String accountName,float amount) {
		this.accountNo=accountNo;
		this.accountName=accountName;
		this.amount=amount;
	}
	
	void deposit(float amt) {
		amount=amount+amt;
		System.out.println(amount+ "Desposited");
		
	}
	
	void withdraw(float amt) {
		if(amount<amt) {
			System.out.println("Funds are insufficient");
			
		}else {
			amount=amount-amt;
			System.out.println("Amout Withdrawn "+amt);
		}
	}
	
	void checkBalance() {
		System.out.println("balance "+amount);
		
	}
	
	void show() {
		System.out.println(accountNo+accountName+amount);
	}
	
	public static void main(String[] args) {
		
		BankingAppln b1=new BankingAppln();
		b1.insertAccount(11, "Jean", 5000);
		b1.show();
		b1.checkBalance();
		b1.deposit(4000);
		b1.checkBalance();//9000
		b1.withdraw(3000);
		b1.checkBalance();//6000
		
	}

}
