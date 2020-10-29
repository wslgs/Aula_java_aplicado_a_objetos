package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double valor = sc.nextDouble();
			account = new Account(number, name, valor);
		} else {
			account = new Account(number, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
		
	}

}
