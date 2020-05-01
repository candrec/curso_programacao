import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); // inicia uma variável da classe Scanner para ajudar na entrada de dadosA
		String x;
		int y;
		double z;
		char sexo;

		System.out.println("Digite uma string");
		x = sc.next(); // captura a string do teclado
		System.out.println("Digite um inteiro: ");
		y = sc.nextInt(); // captura o inteiro do teclado
		System.out.println("Digite um ponto flutuante: ");
		z = sc.nextDouble(); // captura o ponto flutuante do teclado
		System.out.println("Qual o sexo: (F/M)");
		sexo = sc.next().charAt(0); // captura o primeiro caractere da string digitada

		System.out.println("A string digitada foi " + x);
		System.out.println("O inteiro digitado foi " + y);
		System.out.println("O ponto flutuante é " + z);
		System.out.println("O sexo é " + sexo);
		sc.close();
	}

}
