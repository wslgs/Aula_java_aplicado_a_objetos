package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double converter(double price, double quantity) {
		return (quantity + quantity * IOF) * price;
	}
	
}
