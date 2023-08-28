package ejercicios;
/*
Realiza un programa que calcule e imprima la serie de Fibonacci hasta un
número dado ingresado por el usuario.
 */

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numberLimite, primerNumber = 0, siguienteNumber, segundoNumber = 1;

        System.out.print("Digite un número: ");
        numberLimite = entrada.nextInt();

        while (segundoNumber <= numberLimite) {
            System.out.print(segundoNumber+", ");
            siguienteNumber = primerNumber + segundoNumber;
            primerNumber = segundoNumber;
            segundoNumber = siguienteNumber;
        }

        System.out.println("Serie de Fibonacci hasta "+numberLimite);
    }
}
