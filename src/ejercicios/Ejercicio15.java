package ejercicios;
/*
Crea un programa que pida al usuario un número entero y determine si es un
número capicúa. Un número capicúa es aquel que se lee igual de izquierda a
derecha que de derecha a izquierda.
 */

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number, digito, numberOriginal, numberInvertido = 0;

        System.out.print("Digite un número: ");
        number = entrada.nextInt();

        numberOriginal = number;
        while (number > 0) {
            digito = number % 10;
            numberInvertido = numberInvertido * 10 +digito;
            number /= 10;
        }

        if (numberOriginal == numberInvertido) {
            System.out.println("El número "+numberOriginal+" es capicúa");
        }else {
            System.out.println("El número "+numberOriginal+" no es capicúa");
        }
    }
}
