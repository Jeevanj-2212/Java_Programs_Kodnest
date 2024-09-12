package encapsulation;

import java.util.Scanner;

public class BankAccountApp {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Account Number");
		int accnum = sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter Account Holder Name:");
		String name = sc.nextLine();
		System.out.println("Pleae enter Balance");
		int balance = sc.nextInt();
		System.out.println("Enter PIN:");
		int pin = sc.nextInt();
		ba.setAccNum(accnum);
		ba.setAccHolder(name);
		ba.setBalance(balance);
		System.out.println("Account Number: " + ba.getAccNum(pin));
		System.out.println("Account Holder Name: " + ba.getAccHolder(pin));
		System.out.println("Balance: " + ba.getBalance(pin));
		
	}

}
class BankAccount {
	private int accNum;
	private String accHolder;
	private int balance;
	private int pin =54321;
	public void setAccNum(int accNum) {
		if(pin == this.pin) {
			this.accNum = accNum;
			}
		else {
			System.out.println("Wrong pin!");
			return;
		}
	}
	
	public int getAccNum(int pin) {
		if(pin ==this.pin) {
			return accNum;
		}
		else {
			System.out.println("Wrong pin!");
			return 0;
		}
	}
	public void setAccHolder(String accHolder) {
		if(pin == this.pin) {
			this.accHolder = accHolder;
			}
		else {
			System.out.println("Wrong pin!");
			return;
		}
	}
	public String getAccHolder(int pin) {
		if(pin ==this.pin) {
			return accHolder;
		}
		else {
			System.out.println("Wrong pin!");
			return "0";
		}
	}
	public void setBalance(int balance) {
		if(pin == this.pin) {
			this.balance = balance;
			}
		else {
			System.out.println("Wrong pin!");
			return;
		}
	}
	public int getBalance(int pin) {
		if(pin ==this.pin) {
			return balance;
		}
		else {
			System.out.println("Wrong pin!");
			return 0;
		}
		
	}
}
