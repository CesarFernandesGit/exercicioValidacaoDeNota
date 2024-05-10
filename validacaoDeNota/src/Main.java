import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");

		double nota = scanner.nextDouble();
		double soma = 0;
		int contagem = 0;

		while (true) {
			if (nota >= 0 && nota <= 10) {
				soma += nota;
				contagem += 1;
				if (contagem != 2) {
					System.out.print("Digite a segunda nota: ");
					nota = scanner.nextDouble();
				} else {
					break;
				}
			} else {
				System.out.print("Valor invalido! Tente novamente: ");
				nota = scanner.nextDouble();
			}
		}
		System.out.printf("MEDIA = %.2f", soma / contagem);
		scanner.close();
	}
}
