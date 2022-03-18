package danielmendezpascual;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Objeto teclado, para que el usuario meta números por teclado
	Scanner teclado = new Scanner (System.in);
	
	// Variables de la clase
	int num1, num2;
	
	// Primer número
	System.out.println("Introduce el primer número: ");
	num1 = teclado.nextInt();
	
	// Segundo número
	System.out.println("Introduce el segundo número: "); 
	num2 = teclado.nextInt();
	
	// Imprimimos por pantalla las operaciones
	System.out.println("La suma es: " +Calculadora.suma(num1, num2));
	
	System.out.println("La resta es: " +Calculadora.resta(num1, num2));
	
	System.out.println("La multiplicación es: " +Calculadora.multiplicacion(num1, num2));
	
	System.out.println("La división es: " +Calculadora.division(num1, num2));
	
	}

	// Métodos de la clase
	
	public static int suma (int num1, int num2) {
		return (num1+num2);
	}
	
	public static int resta (int num1, int num2) {
		return (num1-num2);
	}
	
	public static int multiplicacion (int num1, int num2) {
		return (num1*num2);
	}
	
	public static int division (int num1, int num2) {
		return (num1/num2);
	}
}
