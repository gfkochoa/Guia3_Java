import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		int c = 0, cert = 0, sinc = 0;
		int nota1 = 0, nota2 = 0, nota3 = 0, asist = 0;
		float prom = 0, porc = 0, max_prom = 0, min_prom = 0;
		String rpta = "S", nombre = "", estado = "";
		String nombre1 = "", nombre2 = "";
		
		while (rpta.equals("S") || rpta.equals("s")) {
			c++;
			System.out.println("----------");
			System.out.println("Registro " + c);
			System.out.println("----------");
			
			System.out.print("Nombre del Alumno: ");
			nombre = sc.nextLine();
			
			System.out.print("Nota 1: ");
			nota1 = sc.nextInt();
			
			System.out.print("Nota 2: ");
			nota2 = sc.nextInt();
			
			System.out.print("Nota 3: ");
			nota3 = sc.nextInt();
			
			System.out.print("Asistencia [1-12]: ");
			asist = sc.nextInt();
			
			prom = nota1*0.2f + nota2*0.3f + nota3*0.5f;
			porc = asist / 0.12f;
			
			if (prom>=13 && porc>=70) {
				estado = "Obtiene Certificado";
				cert++;
			}
			else {
				estado = "Sin Certificado";
				sinc++;
			}
			
			System.out.println("----------");
			System.out.println("Resultados");
			System.out.println("----------");
			System.out.println("Promedio: " + prom);
			System.out.println("Asistencia: " + df.format(porc) + "%");
			System.out.println("Estado: " + estado);
			System.out.println("----------");
			
			sc.nextLine();
			
			System.out.print("¿Registrar otro? [S/N]: ");
			rpta = sc.nextLine();
			
			if (c==1) {
				min_prom = prom;
				nombre2 = nombre;
			}	
				
			if (prom > max_prom) {
				max_prom = prom;
				nombre1 = nombre;
			}
			if (prom < min_prom) {
				min_prom = prom;
				nombre2 = nombre;
			}
		}
		
		if (rpta.equals("N") || rpta.equals("n")) {
			System.out.println("-----------------");
			System.out.println("--R E S U M E N--");
			System.out.println("-----------------");
			System.out.println("Número de alumnos: " + c);
			System.out.println("Mayor promedio: " + max_prom + " pertenece a: " + nombre1);
			System.out.println("Menor promedio: " + min_prom + " pertenece a: " + nombre2);
			System.out.println("Número de alumnos certificados: " + cert);
			System.out.println("Número de alumnos sin certificados: " + sinc);
		}

	}

}
