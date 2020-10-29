import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		numero = sc.nextInt();
		
		if(numero % 2 != 0) {
			System.out.println("IMPAR");
		}else {
			System.out.println("PAR");
		}
		
		sc.close();
	}

}
