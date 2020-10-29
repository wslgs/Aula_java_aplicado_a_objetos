import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, area;
		
		R = sc.nextDouble();
		area = R * R * 3.14159;
		
		System.out.printf("A=%.4f%n", area);
		
		sc.close();
	}

}
