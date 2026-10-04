import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Calculadora sencilla");
		System.out.print("Ingresa el primer número: ");
		double numero1 = scanner.nextDouble();

		System.out.print("Ingresa la operación (+, -, *, /): ");
		char operacion = scanner.next().charAt(0);

		System.out.print("Ingresa el segundo número: ");
		double numero2 = scanner.nextDouble();

		switch (operacion) {
			case '+':
				System.out.println("Resultado: " + (numero1 + numero2));
				break;
			case '-':
				System.out.println("Resultado: " + (numero1 - numero2));
				break;
			case '*':
				System.out.println("Resultado: " + (numero1 * numero2));
				break;
			case '/':
				if (numero2 == 0) {
					System.out.println("Error: no se puede dividir entre cero.");
				} else {
					System.out.println("Resultado: " + (numero1 / numero2));
				}
				break;
			default:
				System.out.println("Operación no válida.");
		}

		scanner.close();
	}
}
