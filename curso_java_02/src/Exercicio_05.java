import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1, numero1, codigo2, numero2;
		double valorUnitario1, valorUnitario2, valorAPagar;
		
		codigo1 = sc.nextInt();
		numero1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		
		codigo2 = sc.nextInt();
		numero2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		valorAPagar = numero1 * valorUnitario1 + numero2 * valorUnitario2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorAPagar);
		
		sc.close();
	}

}
