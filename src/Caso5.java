import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = 1, num = 0, num_menor = 1;
		
		while (c <= 5) {
			System.out.print("Ingrese número " + c + ": ");
			num = sc.nextInt();
			
			if(c == 1)
				num_menor = num;
			
			if(num < num_menor)
				num_menor = num;
			
			c++;
		}
		System.out.println("El número menor es: " + num_menor);
	}
}
