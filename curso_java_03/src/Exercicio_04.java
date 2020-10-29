import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hi, hf, duracao;
		
		hi = sc.nextInt();
		hf = sc.nextInt();
		
		if(hf <= hi)
			duracao = hf + 24 - hi;
		else 
			duracao = hf - hi;
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}

}