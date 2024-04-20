package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;



public class Main {
	
	/*
	 * 	Dentro del paquete creado para el ejercicio crear la clase Main que contenga el método main().
		Declare las variables necesarias para realizar el cálculo del factorial de un número que se introduce 
		por consola y está dentro del rango numérico [0,10]. Utilice una estructura de control iterativa While
		para resolver el ejercicio. Muestre el resultado por consola.
		El factorial de un número entero (n!) se calcula de la siguiente forma:
		numero! = numero *(numero-1)*(numero-2)...1
		0! = 1 (por definición)
		1! = 1
		2! = 2 * 1 = 2
		3! = 3 * 2 * 1 = 6
		4! = 4 * 3 * 2 * 1 = 24
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        int num, factorial = 1;
        
        do {
        	
            System.out.print("Ingrese un número entre 0 y 10: ");
            num = scanner.nextInt();
            
        } while (num < 0 || num > 10);
        
        int i=1;
        
        while (i<=num) {
        	
        	factorial *= i;
        	i++;
        	
        }
        
        System.out.println("El factorial de " + num + " es: " + factorial);
        
        scanner.close();
		
	}
}
