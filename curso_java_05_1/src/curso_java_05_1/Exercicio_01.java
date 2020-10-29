package curso_java_05_1;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio_01 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);
		
		sc.close();
		
	}

}
