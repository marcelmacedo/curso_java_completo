import java.util.Scanner;

public class EstruturaRepetitivaWhile {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0; // Toda variavel tem que receber um valor
		
		while(x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}
