package ejercicios;
/*
Crea un programa que pida al usuario una oración y muestre cuántas
palabras contiene
 */

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cadenaOracion;
        int cantidadPalabras = 0;
        boolean esPalabra = false;
        char caracter;

        System.out.print("Digite una frase: ");
        cadenaOracion = entrada.nextLine();

        for (int i = 0; i < cadenaOracion.length(); i++) {
            caracter = cadenaOracion.charAt(i);
            if (Character.isLetterOrDigit(caracter)) {
                if (!esPalabra) {
                    esPalabra = true;
                    cantidadPalabras++;
                }
            } else {
                esPalabra = false;
            }
        }
        System.out.println("La oración contiene " + cantidadPalabras + " palabras");
    }
}
