package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

/*	Fazer um programa para ler o nome do aluno e as 3 notas que obteve em 3 trimestres do ano
	(primeiro trimestre valendo 30, segunto e terceiro valendo 35 cada) Ao final, mostrar a nota final do aluno no ano.
	Dizer se foi aprovado(PASS) ou não(FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o minimo
	para ser aprovado(que é 60% da nota).
*/

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		sc.close();

	}

}
