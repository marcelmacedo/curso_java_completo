package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

/*	Faca um programa para ler os dados de um Funcionario (nome, salarioBruto e imposto). em seguida,
	mostrar os dados do funcionario (nome, salarioLiquido). Em seguida, aumentar o salario do funcionario
	com base em porcentagem dada (somente salario bruto é afetado pela porcentagem) e mostrar novamente os
	dados do funcionario.
*/

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + emp);

		sc.close();

	}

}
