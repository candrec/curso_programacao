import java.util.Scanner;

public class TesteWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,aux=0;
		System.out.println("digite um inteiro: ");
		num=sc.nextInt();
		while(num != 0) {
			aux += num;
			System.out.println("digite um inteiro: ");
			num=sc.nextInt();
		}
		System.out.println(aux);
		sc.close();
	}

}
