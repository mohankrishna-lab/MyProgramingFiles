package programsprac;

import java.util.Scanner;

public class BankingTransactions {
	
	static double amt = 1000;
	static double wallet = 200;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("choose an option");
			System.out.println("1.to deposite\n2.to withdraw\n3.transfer to wallet\n4.transfer to bank\n5.exit");
			int option = sc.nextInt();
			switch (option)
			{
			case 1 :System.out.println("enter amount to deposite");
				double depoAmt = sc.nextDouble();
				deposit(amt, depoAmt);
				break;
				
			case 2 : System.out.println("enter amount to withdraw");
				double withDrawAmt = sc.nextDouble();
				withDraw(amt, withDrawAmt);
				break;
				
			case 3 : System.out.println("enter amount to transfer to wallet");
				double transAmt = sc.nextDouble();
				transferToWallet(amt, transAmt);
				break;
			case 4 : System.out.println("enter amount to transfer from wallet to bank");
				double transAm = sc.nextDouble();
				transferToBankFromWallet(amt, transAm);
				break;
			case 5 : System.exit(0);
			}
		}
		
	}
	
	public static void deposit(double amt, double depoAmt)
	{
		amt = amt + depoAmt;
		System.out.println("your amount now is " + amt);
	}
	
	public static void withDraw(double amt, double withDrawAmt)
	{
		amt = amt - withDrawAmt;
	}
	
	public static void transferToWallet(double amt, double transAmt)
	{
		transAmt += transAmt;
		
		amt -= transAmt;
	}
	
	public static void transferToBankFromWallet(double amt, double transAmt)
	{
		amt += transAmt;
		transAmt -= transAmt;
	}
}
