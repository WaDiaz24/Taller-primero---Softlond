package ejercicios;
/*
Escribe un programa que pida al usuario un número y verifique si es positivo,
negativo o cero.
 */
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number;

        System.out.print("Digite un número: ");
        number = entrada.nextInt();

        if (number > 0) {
            System.out.println("El número: " + number + " es positivo");
        } else if (number < 0) {
            System.out.println("El número: " + number + " es negativo");
        } else {
            System.out.println("El número: " + number + " es 0");
        }
    }
}
