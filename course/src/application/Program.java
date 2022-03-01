package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		//double xA, xB, xC, yA, yB, yC;
		Triangle x, y;
		
		//instanciar objeto Triangle
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble(); //3.00
		x.b = sc.nextDouble(); //4.00
		x.c = sc.nextDouble(); //5.00
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble(); // 7.50 
		y.b = sc.nextDouble(); //4.50
		y.c = sc.nextDouble(); //4.02
		
		/* // Esta solucao foi transformada em funcao/metodo da classe Triangle.
		 * double p = (x.a + x.b + x.c) / 2.0; double areaX = Math.sqrt(p * (p - x.a) *
		 * (p - x.b) * (p - x.c));
		 * 
		 * p = (y.a + y.b + y.c) / 2.0; double areaY = Math.sqrt(p * (p - y.a) * (p -
		 * y.b) * (p - y.c));
		 */		
		
		// Instanciando a funcao/metodo da classe Triangle.
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}
}