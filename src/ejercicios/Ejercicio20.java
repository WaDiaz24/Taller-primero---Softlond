package ejercicios;
/*
Realiza un programa que solicite al usuario una cadena y luego invierta su
orden
 */

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cadena, cadenaInvertida = "";

        System.out.print("Digite una cadena: ");
        cadena = entrada.next();

        for (int i = cadena.length()-1; i >= 0 ; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        System.out.println("La cadena es: "+cadenaInvertida);
    }
}
