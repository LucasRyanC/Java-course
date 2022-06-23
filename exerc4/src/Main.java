import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double func, horas, valor, salario;
		
		func = sc.nextDouble();
		horas = sc.nextDouble();
		valor = sc.nextDouble();
		
		salario = horas * valor;
		
		System.out.println("Number = " + func);
		System.out.printf("Salary = R$%.2f", salario);
		
		
		
		sc.close();
	

	}

}
