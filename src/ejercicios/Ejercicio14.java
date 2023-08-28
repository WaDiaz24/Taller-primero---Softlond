package ejercicios;
/*
Escribe un programa que solicite al usuario un número entero positivo y
verifique si es un número perfecto. Un número perfecto es aquel cuya suma
de sus divisores propios (excluyendo al propio número) es igual al número.
 */

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number, sumaDivisores = 1;

        System.out.print("Digite un número: ");
        number = entrada.nextInt();

        for (int i = 2; i *i <= number ; i++) {
            if(number % i == 0) {
                sumaDivisores += i;
                if (i != number / i) {
                    sumaDivisores += number / i;
                }
            }
        }

        if (sumaDivisores == number) {
            System.out.println("El número "+number+" es perfecto");
        }else {
            System.out.println("El número "+number+" no es perfecto");
        }
    }
}
