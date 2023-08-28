package ejercicios;
/*
Realiza un programa que pida al usuario un número entero y determine si es
un número primo o no.
 */
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number;
        boolean esPrimo = true;

        System.out.print("Digite un número: ");
        number = entrada.nextInt();

        if (number <= 1) {
            esPrimo = false;
        }else{
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        if (esPrimo) {
            System.out.println("El número "+number+" es primo");
        }else {
            System.out.println("El número "+number+" no es primo");
        }
    }
}
