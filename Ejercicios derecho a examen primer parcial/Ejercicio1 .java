import java.util.Scanner;
Public class Ejercicio1 {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		double metro, pie, pulgada;

		System.out.println("=== Convertidor de metros a pies y pulgadas ===");
		System.out.println("1m ----> 3.281 pies");
		System.out.println("1m ----> 39.37 pulgadas");

		System.out.println("ponga la cantidad en metros que deseas Convertir");
		metro = sc.nextDouble();

		pulgada = metro * 39.37;
		pie = metro * 3.281;

		System.out.println(metro + "m son: " + pulgada + " pulgadas");
		System.out.println(metro + "m son: " + pie + " pies");
}
}