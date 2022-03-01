import java.util.Locale;
import java.util.Scanner;

/*
 * Calcula valor de um terreno 
 * */

public class Debug {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble(); //10.0
		double comprimento = sc.nextDouble(); //30.0
		double metroQuadrado = sc.nextDouble(); //200.0
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
	}
}
