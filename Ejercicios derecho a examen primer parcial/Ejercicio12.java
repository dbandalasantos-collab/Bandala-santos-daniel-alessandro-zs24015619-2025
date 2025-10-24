import java.util.Scanner;
public class Ejercicio12{
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	int categoria;
	double horastrabajadas, pagoporhora, salariomensualbruto, subsidio=0.0, descuentosalud, salariototalneto, DESCUENTO_SALUD_PORCENTAJE = 0.072, SUBSIDIO_PORCENTAJE = 0.15, LIMITE_SUBSIDIO = 1000000.0;
		System.out.println("--- Cálculo de Nómina Mensual ---");
		System.out.print("Ingrese la categoría del empleado (1, 2, 3 o 4): ");
		categoria = scanner.nextInt();
		System.out.print("Ingrese el número de horas trabajadas en el mes: ");
		horastrabajadas = scanner.nextDouble();
			switch (categoria) {
				case 1:
					pagoporhora = 20000.0;
					break;
				case 2:
					pagoporhora = 15000.0;
					break;
				case 3:
					pagoporhora = 10000.0;
					break;
				case 4:
					pagoporhora = 7500.0;
					break;
				default:
					System.out.println("Categoría no válida. Se asignará pago por hora de $0.0.");
					pagoporhora = 0.0;
					break;
		}
				salariomensualbruto = horastrabajadas * pagoporhora;
				if (salariomensualbruto < LIMITE_SUBSIDIO) {
				subsidio = salariomensualbruto * SUBSIDIO_PORCENTAJE;
		}
				descuentosalud = salariomensualbruto * DESCUENTO_SALUD_PORCENTAJE;
				salariototalneto = salariomensualbruto - descuentosalud + subsidio;
				System.out.println("--- Resumen de Pago ---");
				System.out.printf("Categoría del Empleado: %d\n", categoria);
				System.out.printf("Pago por Hora: $%.2f\n", pagoporhora);
				System.out.printf("Horas Trabajadas: %.2f\n", horastrabajadas);
				System.out.println("---------------------------------");
				System.out.printf("Salario Mensual BRUTO: $%.2f\n", salariomensualbruto);
				System.out.printf("   (+) Subsidio (15%%): $%.2f\n", subsidio);
				System.out.printf("   (-) Descuento Salud (7.2%%): $%.2f\n", descuentosalud);
				System.out.println("---------------------------------");
				System.out.printf("Salario Total NETO a Pagar: $%.2f\n", salariototalneto);
        scanner.close();
    }
}