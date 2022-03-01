package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

/*	Fazer um programa para calcular os valores da largura e altura
	de um retângulo. Em seguinda, mostrar na tela o valor da sua area,
	perimetro e diagonal.
*/
public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rect = new Rectangle();

		System.out.println("Enter rectangle width and height:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());

		sc.close();

	}

}
