package ejercicios;
/*
Crea un programa que solicite al usuario una frase y luego muestre las
palabras ordenadas alfabéticamente
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String frase, palabras[];

        System.out.print("Digite una frase: ");
        frase = entrada.nextLine();

        palabras = frase.split(" ");

        System.out.println("Palabras ordenadas alfabéticamente: ");
        Arrays.sort(palabras);

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
