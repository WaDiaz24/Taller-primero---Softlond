package ejercicios;
/*
Suma de elementos: Escribe un programa que calcule la suma de todos los
elementos en un arreglo de enteros
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arreglo[] = new int[5], suma=0;

        System.out.println("Suma de elementos de un arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i+1)+": Digite números enteros: ");
            arreglo[i] = entrada.nextInt();
            suma += arreglo[i];
        }

        System.out.println("La suma de los números del arreglo es: "+suma);
    }
}
