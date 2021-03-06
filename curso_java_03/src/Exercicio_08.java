import java.util.Locale;
import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		if(salario >= 0.0 && salario <= 2000.00) {
			System.out.println("Isento");
		} else if(salario >= 2000.01 && salario <= 3000.0) {
			System.out.printf("R$ %.2f%n", (salario - 2000.0) * 0.08);
		} else if(salario >= 3000.01 && salario <= 4500.00) {
			System.out.printf("R$ %.2f%n", 80.0 + (salario - 3000.0) * 0.18);
		} else if(salario > 4500.00) {
			System.out.printf("R$ %.2f%n", 350.0 + (salario - 4500.0) * 0.28);
		}
		
		sc.close();
	}

}
