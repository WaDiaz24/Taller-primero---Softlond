package ejercicios;
/*
Escribe un programa que solicite al usuario una frase y verifique si es un
palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda)
 */

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cadena, cadenaInvertida = "";

        System.out.print("Digite una palabra: ");
        cadena = entrada.next();

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        if (cadena.equals(cadenaInvertida)) {
            System.out.println("Las frase es palíndromo");
        }else{
            System.out.println("Las frase no es palíndromo");
        }
    }
}
