import java.util.Scanner;
public class Ejercicio17 {
public static void main(String args)[] {
Scanner scanner = new Scanner(System.in);  
	System.out.print("Ingrese un número entero N: ");      
	if (!scanner.hasNextInt()) {
	System.out.println("Error: La entrada no es un número entero válido.");
	scanner.close();
	return;
	}
	int N = scanner.nextInt();
	scanner.close(); // Cerrar el scanner
System.out.println("\nEl número ingresado es: " + N);
	boolean esPrimo = esNumeroPrimo(N);
	if (esPrimo) {
	System.out.println("Mensaje: El número " + N + " ES un número Primo. ");
	} else {
	System.out.println("Mensaje: El número " + N + " NO es un número Primo. ");
	}
	}

    /**
     * Función para determinar si un número es primo.
     * Un número primo es un número natural mayor que 1 
     * que tiene únicamente dos divisores positivos distintos: él mismo y el 1.
     * @param numero El número a verificar.
     * @return true si el número es primo, false en caso contrario.
     */
    public static boolean esNumeroPrimo(int numero) {
        // Los números menores o iguales a 1 no son primos por definición
        if (numero <= 1) {
            return false;
        }

        // El 2 es el único número primo par
        if (numero == 2) {
            return true;
        }

        // Si es par y mayor que 2, no es primo
        if (numero % 2 == 0) {
            return false;
        }

        /* * Solo necesitamos verificar divisores impares desde 3 hasta la 
         * raíz cuadrada del número (inclusive).
         * Si un número tiene un divisor mayor que su raíz cuadrada, 
         * también debe tener un divisor menor que su raíz cuadrada.
         */
        int limite = (int) Math.sqrt(numero);
        for (int i = 3; i <= limite; i += 2) {
            if (numero % i == 0) {
                return false; // Se encontró un divisor
            }
        }

        return true; // No se encontraron divisores, por lo tanto, es primo
    }
}