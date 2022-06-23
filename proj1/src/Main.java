import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double soma = n1 + n2;
		
		double resultado = soma;
		
		System.out.printf("SOMA = " + soma);
		
		
		
		
		sc.close();
		

	}

}
