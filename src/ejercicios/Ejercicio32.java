package ejercicios;
/*
Buscar un elemento: Escribe un programa que busque un número específico
en un arreglo y muestre su índice (o un mensaje si no se encuentra).
 */

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arreglo[] = new int[5], numero, indice = 0;

        System.out.println("Arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i + 1) + ": Digite números enteros: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.print("Digite el número a buscar: ");
        numero = entrada.nextInt();

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                indice = i;
                break;
            }
        }
        if (indice == 0) {
            System.out.println("El número no se ha encotrado");
        }else {
            System.out.println("El número "+numero+" se encuentra en el indice "+indice);
        }
    }
}

