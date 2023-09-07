package ejercicios;
/*
Encontrar el número más grande: Crea un programa que encuentre el número
más grande en un arreglo de enteros
 */

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arreglo[] = new int[5], masGrande;

        System.out.println("Arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i+1)+": Digite números enteros: ");
            arreglo[i] = entrada.nextInt();
        }
        masGrande = arreglo[0];

        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] > masGrande) {
                masGrande = arreglo[i];
            }
        }
        System.out.println("El número mas grande es: "+masGrande);
    }
}
