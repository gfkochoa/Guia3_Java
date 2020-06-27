import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		String rpta = "S", nombre = "";
		int ht = 0, tph = 0, tard = 0, sueldo = 0;
		float bono = 0, dcto = 0, sneto = 0, porc = 0;
		int c = 0, m = 0;
		float max_sneto = 0, min_sneto = 0, tard1 = 0;
		String nombre1 = "", nombre2 = "", nombre3 = "";
		
		while (rpta.equals("S") || rpta.equals("s")) {
			c++;
			System.out.println("*************************");
			System.out.println("Registro de Empleados " + "(" + c + ")");
			System.out.println("*************************");
			
			System.out.print("Empleado: ");
			nombre = sc.nextLine();
			
			System.out.print("Horas trabajadas: ");
			ht = sc.nextInt();
			
			System.out.print("Tarifa por hora: ");
			tph = sc.nextInt();
			
			System.out.print("Minutos de tardanza: ");
			tard = sc.nextInt();
			
			sueldo = ht * tph;
			
			if(ht < 50) {
				bono = 0f;
			} else if(ht < 60) {
				bono = sueldo * 0.02f;
			} else if(ht < 70) {
				bono = sueldo * 0.08f;
			} else if(ht < 80) {
				bono = sueldo * 0.13f;
			} else {
				bono = sueldo * 0.15f;
			}
			
			if(tard <= 15) {
				dcto = 0f;
			} else if(tard <= 30) {
				dcto = sueldo * 0.003f * tard;
			} else {
				dcto = sueldo * 0.005f * tard;
			}
			
			sneto = sueldo + bono - dcto;
			porc = ht / 0.8f;
			
			System.out.println("**************");
			System.out.println("  Resultados  ");
			System.out.println("**************");
			System.out.println("Sueldo bruto: " + sueldo);
			System.out.println("Bonificación: " + bono);
			System.out.println("Descuento: " + dcto);
			System.out.println("Sueldo neto: " + sneto);
			System.out.println("% Alcanzado: " + df.format(porc) + "%");
			System.out.println("**************");
			
			sc.nextLine();
			
			System.out.print("¿Nuevo empleado? [S/N]: ");
			rpta = sc.nextLine();
			
			if(c == 1) {
				min_sneto = sneto;
				nombre2 = nombre;
				tard1 = tard;
				nombre3 = nombre;
			}
			
			if(sneto > max_sneto) {
				max_sneto = sneto;
				nombre1 = nombre;
			}
			
			if(sneto < min_sneto) {
				min_sneto = sneto;
				nombre2 = nombre;
			}
			
			if(tard1 < tard) {
				tard1 = tard;
				nombre = nombre;
			}
			
			if(porc > 90)
				m++;
		}
		
		if (rpta.equals("N") || rpta.equals("n")) {
			System.out.println("-----------------");
			System.out.println("--R E S U M E N--");
			System.out.println("-----------------");
			System.out.println("Número de empleados: " + c);
			System.out.println("Sueldo neto mayor: " + max_sneto + " pertenece a: " + nombre1);
			System.out.println("Sueldo neto menor: " + min_sneto + " pertenece a: " + nombre2);
			System.out.println("Empleado con la mayor cantidad de minutos de tardanza: " + nombre3 + " (" + tard1 + " min.)");
			System.out.println("Cantidad de empleado con más del 90% de la meta: " + m);
		}
	}
}
