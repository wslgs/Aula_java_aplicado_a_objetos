import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.nextInt() != 2002)
			System.out.println("Senha Invalida");
		
		System.out.println("Acesso Permitido");
		
		sc.close();
		
	}

}
