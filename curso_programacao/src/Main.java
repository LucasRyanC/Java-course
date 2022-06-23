import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double x = 32.5418497;
		
		String nome = "Myllena";
		int idade = 16;
		double renda = 600.0;
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	
	}

}
