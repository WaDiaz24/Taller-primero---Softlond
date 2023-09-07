package ejercicios;
/*
Realiza un programa que solicite al usuario una cadena y reemplace todas
las apariciones de una letra específica por otra
 */

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cadena, nuevaCadena;
        char letra, letraE;

        System.out.print("Digite una cadena: ");
        cadena = entrada.nextLine();
        System.out.print("Digite una letra: ");
        letra = entrada.next().charAt(0);
        System.out.print("Digite la letra por la que la va a reemplazar: ");
        letraE = entrada.next().charAt(0);

        nuevaCadena = cadena.replace(letra, letraE);
        System.out.println("La cadena "+cadena+" cambio la letra "+letra+" por "+letraE);
        System.out.println("La nueva cadena queda asi: "+nuevaCadena);
    }
}
