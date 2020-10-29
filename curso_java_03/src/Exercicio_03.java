import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A > B) {
			if(A % B == 0) {
				System.out.println("Sao Multiplos");
			} else {
				System.out.println("Nao sao Multiplos");
			}
		}else {
			if(B % A == 0) {
				System.out.println("Sao Multiplos");
			} else {
				System.out.println("Nao sao Multiplos");
			}
		}
		
		sc.close();
	}

}