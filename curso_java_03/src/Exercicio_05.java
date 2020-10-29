import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		if(codigo == 1) {
			System.out.printf("Total: R$ %.2f%n", quantidade * 4.00);
		} else if(codigo == 2){
			System.out.printf("Total: R$ %.2f%n", quantidade * 4.50);
		} else if(codigo == 3){
			System.out.printf("Total: R$ %.2f%n", quantidade * 5.00);
		} else if(codigo == 4){
			System.out.printf("Total: R$ %.2f%n", quantidade * 2.00);
		} else if(codigo == 5){
			System.out.printf("Total: R$ %.2f%n", quantidade * 1.50);
		}
		
		sc.close();
	}

}
