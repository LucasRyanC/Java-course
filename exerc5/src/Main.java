import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod, num, cod2, num2;
		double valor, valor2, total;
		
		System.out.print("Digite o código: ");
		cod = sc.nextInt();
		System.out.print("Digite a quantidade: ");
		num = sc.nextInt();
		System.out.print("Digite o valor: ");
		valor = sc.nextDouble();
		
		System.out.println("");
		
		System.out.print("Digite o código: ");
		cod2 = sc.nextInt();
		System.out.print("Digite a quantidade: ");
		num2 = sc.nextInt();
		System.out.print("Digite o valor: ");
		valor2 = sc.nextDouble();
		
		
		System.out.println("");
		total = (num * valor) + (num2 * valor2);
		
		System.out.printf("Total dos produtos: %.2f", total);
		
		
		
		
		
		
		
		
		sc.close();

	}

}
