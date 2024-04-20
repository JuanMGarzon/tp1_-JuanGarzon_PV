package ar.edu.unju.fi.ejercicio3;
import java.util.Scanner;

public class Main {
	
	/*
	 * 	Dentro del paquete creado para el ejercicio crear la clase Main que contenga al método main().
		Declare las variables necesarias para realizar lo siguiente:
		Solicitar al usuario que ingrese por consola un número entero que debe ser almacenado en una
		variable (Investigue como utilizar la clase Scanner para poder ingresar datos por consola).
		Si el número ingresado es impar mostrar el doble del número y si es par mostrar el triple del número.
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num;
        
        System.out.print("Ingrese un número entero: ");
        num = scanner.nextInt();
        
        if (num % 2 == 0) {
        	
            System.out.println("El número ingresado es par. \nEl triple del número es: " + (num * 3));
            
        } else {
        	
            System.out.println("El número ingresado es impar. \nEl doble del número es: " + (num * 2));
            
        }
        
        scanner.close();
		
	}
}
