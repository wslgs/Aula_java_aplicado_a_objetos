package entities;

public class Account {
	
	private int number;
	private String name;
	private double saldo;
	
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Account(int number, String name, double newDeposit) {
		this.number = number;
		this.name = name;
		deposit(newDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposit(double valor) {
		saldo += valor;
	}
	
	public void withdraw(double valor) {
		saldo -= valor + 5.00;
	}
	
	public String toString() {
		return "Account " + number + ", Holder: " + name + ", Balance: $ " + String.format("%.2f%n", saldo);
	}
	
}
