import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		// Dados para teste da matriz
		// n = 3 elementos
		// 5 -3 10
		// 15 8  2
		// 7  9 -4
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] mat = new int [n][n]; 			//instancia matriz na memoria
		
		for (int i=0; i<mat.length; i++) {				// percorre para preencher as linhas
			
			for (int j=0; j<mat.length; j++) { 			// percorre para preencher as colunas
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main Diagonal: ");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();

		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);
		
		
		sc.close();

	}

}
