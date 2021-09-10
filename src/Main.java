import java.util.Scanner;

public class Main {

	public static String allvalue;

	public static void main(String[] args) {

		int decimal, resto;
		double resultado;

		Scanner input = new Scanner(System.in);
		System.out.print("Digite o valor em decimal");
		decimal = input.nextInt();

		System.out.print("(" + decimal + ")10 = ");
		resto = decimal % 2;
		resultado = decimal;
		for (int x = 0; x < 15; x++) {
			if (resultado >= 1) {
				resto = (int) (resultado % 2);
				resultado = resultado / 2;
				// StringBuilder s = new StringBuilder();
				if (allvalue == null) {
					allvalue = "" + resto;

				} else {
					allvalue = allvalue + resto;
				}
			}
		}
		StringBuilder s = new StringBuilder();
		System.out.print("("+s.append(allvalue).reverse()+")2");
		
		// OU SIMPLESMENTE ->
		System.out.print("\n" + Integer.toBinaryString(decimal));
		input.close();
	}
}
