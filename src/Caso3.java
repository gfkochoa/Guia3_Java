import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = 1, fact = 1;
		
		System.out.print("Ingrese n�mero: ");
		int num = sc.nextInt();
		
		if (num <= 7) {
			while (c <= num) {
				fact = fact * c;
				c++;
			}
			System.out.println("El factorial de " + num + " es: " + fact);
		} else {
			System.out.println("El n�mero es superior de 7");
		}
	}
}
