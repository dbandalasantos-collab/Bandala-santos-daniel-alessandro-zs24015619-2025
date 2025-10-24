import java.util.Scanner;
Public class Ejercico 3{
	public static void main(String args[]){
		int edad;
		double pulso;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa tu edad");
		edad = sc.nextInt();
	
		pulso = (220-edad)/10;
		System.out.println("Tu número de pulsaciones debe ser: " + pulso);
	}
}