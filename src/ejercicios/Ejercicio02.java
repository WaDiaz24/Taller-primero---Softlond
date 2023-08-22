package ejercicios;
/*
Escribe un programa que pida al usuario un número entero y determine si es
par o impar.
 */
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number;

        System.out.print("Digite un número: ");
        number = entrada.nextInt();

        String parOImpar = (number % 2 == 0) ? "El número es par" : "El número es impar";

        System.out.println(parOImpar);
    }
}
