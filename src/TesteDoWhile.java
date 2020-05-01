import java.util.Locale;
import java.util.Scanner;

public class TesteDoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double celsius;
		double fahren;
		char condicao;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			celsius=sc.nextDouble();
			fahren=((9*celsius)/5)+32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n",fahren);
			System.out.print("Deseja repetir (s/n): ");
			condicao=sc.next().charAt(0);
		}while(condicao=='s');
		
		sc.close();
	}

}
