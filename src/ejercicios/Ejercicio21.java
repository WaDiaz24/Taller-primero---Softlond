package ejercicios;
/*
Pide al usuario una cadena y muestra cuántas veces aparece una letra
específica en ella
 */

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cadena;
        char letra;
        int contador = 0;

        System.out.print("Digite una cadena: ");
        cadena = entrada.next();

        System.out.print("Digite una letra: ");
        letra = entrada.next().charAt(0);

        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("La letra: "+letra+" aparece "+contador+" veces");
    }
}
