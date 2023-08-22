package ejercicios;
/*
Realiza un programa que solicite al usuario dos números enteros y determine
cuál es el mayor de ellos
 */
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number1, number2;

        System.out.print("Digite un número: ");
        number1 = entrada.nextInt();
        System.out.print("Digite un segundo número: ");
        number2 = entrada.nextInt();

        if (number1 > number2) {
            System.out.println("El número: " + number1 + " es mayor al número: " + number2);
        } else if (number1 < number2) {
            System.out.println("El número: " + number1 + " es menor al número: " + number2);
        } else {
            System.out.println("Los números son iguales");
        }
    }
}
