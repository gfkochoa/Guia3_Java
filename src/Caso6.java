import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = 0, aptos = 0, edad = 0;
		String rpta = "S", nombre = "", estado = "";
		
		// String es un objeto
		while (rpta.equals("S") || rpta.equals("s")) {
			c++;
			System.out.println("Datos del registro " + c);
			System.out.println("======================");
			
			System.out.print("Nombre: ");
			nombre = sc.nextLine();
			
			System.out.print("Edad: ");
			edad = sc.nextInt();
			
			if (edad >=18) {
				estado = "Apto para votar";
				aptos++;
			}
			else
				estado = "Menor de edad";
			
			System.out.println("Estado: " + estado);
			
			// Reiniciar el objeto de lectura
			sc.nextLine();
			
			System.out.print("¿Desa continuar? [S/N]: ");
			rpta = sc.nextLine();
		}
		System.out.println("RESUMEN");
		System.out.println("=======");
		System.out.println("Número de participantes: " + c);
		System.out.println("Número de participantes aptos para votar: " + aptos);
	}

}
