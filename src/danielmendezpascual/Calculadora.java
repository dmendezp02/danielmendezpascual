package danielmendezpascual;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Objeto teclado, para que el usuario meta n�meros por teclado
	Scanner teclado = new Scanner (System.in);
	
	// Variables de la clase
	int num1, num2;
	
	// Primer n�mero
	System.out.println("Introduce el primer n�mero: ");
	num1 = teclado.nextInt();
	
	// Segundo n�mero
	System.out.println("Introduce el segundo n�mero: "); 
	num2 = teclado.nextInt();
	
	// Imprimimos por pantalla las operaciones
	System.out.println("La suma es: " +Calculadora.suma(num1, num2));
	
	System.out.println("La resta es: " +Calculadora.resta(num1, num2));
	
	System.out.println("La multiplicaci�n es: " +Calculadora.multiplicacion(num1, num2));
	
	System.out.println("La divisi�n es: " +Calculadora.division(num1, num2));
	
	}

	// M�todos de la clase
	
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
