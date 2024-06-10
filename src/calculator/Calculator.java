package calculator;

import java.util.Scanner;

public class Calculator{
  // Variables de los números
  private double num1;
  private double num2;

  // Constructor
  public Calculator(){
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Type the first number");
    num1 = scanner.nextDouble();
    System.out.println("Type the second number");
    num2 = scanner.nextDouble();
    }
  
  // Metodo de la suma
  public double add() {
	  return num1 + num2;
  }
  
//Metodo de la resta
  public double subtract() {
	  return num1 - num2;
  }
  
//Metodo de la multiplicacion
  public double multiply() {
	  return num1 * num2;
  }

//Metodo de la división
  public double divide() {
	  return num1 / num2;
  }
 
//Metodo del módulo
  public double modulo() {
	  return num1 % num2;
  }
  
public static void main(String[] args) {
	// Crea la instancia de la calculadora
	Calculator calcu = new Calculator();
	
	double add = calcu.add();
	System.out.println("The sum of the entered numbers is: " + add);
	
	double subtract = calcu.subtract();
	System.out.println("The difference between the entered numbers is: " + subtract);
	
	double multiply = calcu.multiply();
	System.out.println("The product of the entered numbers is: " + multiply);
	
	double divide = calcu.divide();
	System.out.println("The division of the entered numbers is: " + divide);
	
	double modulo = calcu.modulo();
	System.out.println("The remainder when the first number is divided by the second number is: " + modulo);
	
  }






}