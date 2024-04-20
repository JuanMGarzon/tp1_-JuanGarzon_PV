package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;

public class Main {
	
	/*
	 * 	Dentro del paquete creado para el ejercicio crear la clase Main que contenga el método main().
		Declare las variables necesarias para solicitar al usuario que ingrese por consola un número 
		entero que esté comprendido entre [1,9], mostrar por consola la tabla de multiplicar 
		correspondiente al número ingresado. (usar la estructura de control iterativa for)
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        int num;
        
        do {
        	
            System.out.print("Ingrese un número entre 1 y 9: ");
            num = scanner.nextInt();
            
        } while (num < 1 || num > 9);
        
        System.out.println("Tabla de multiplicar del " + num + ":");
        
        for (int i = 1; i <= 10; i++) {
        	
            System.out.println(num + " x " + i + " = " + (num * i));
            
        }
        
        scanner.close();
		
	}
}
