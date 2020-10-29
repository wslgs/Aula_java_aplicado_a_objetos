package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double price, quantity;
		
		System.out.print("What is the dollar price? ");
		price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		quantity = sc.nextDouble();
		
		System.out.println("Amout to be paid in reais = " + String.format("%.2f", CurrencyConverter.converter(price, quantity)));
		
		sc.close();
	}

}