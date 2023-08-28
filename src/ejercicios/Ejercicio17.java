package ejercicios;
/*
Pide al usuario dos números enteros y muestra todos los números primos
que se encuentran en ese rango.
 */

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number1, number2;

        System.out.print("Digite un número: ");
        number1 = entrada.nextInt();

        System.out.print("Digite el siguiente número: ");
        number2 = entrada.nextInt();

        for (int i = number1; i <= number2; i++) {
            if (esPrimo(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean esPrimo(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
