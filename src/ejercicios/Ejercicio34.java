package ejercicios;
/*
Rotación de elementos: Implementa un programa que rote los elementos de
un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arreglo[] = new int[5], nuPosiciones, opcion, temp, longitud;

        System.out.println("Arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i + 1) + ": Digite números enteros: ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.print("Digite las posiciones a desplazar: ");
        nuPosiciones = entrada.nextInt();

        longitud = arreglo.length;
        nuPosiciones %= longitud;

        do {
            System.out.println("Digite si a la derecha o izquierdad\n" +
                    "1. Derecha\n" +
                    "2. Izquierda\n" +
                    "3. Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < nuPosiciones; i++) {
                        temp = arreglo[longitud - 1];
                        for (int j = longitud - 1; j > 0; j--) {
                            arreglo[j] = arreglo[j - 1];
                        }
                        arreglo[0] = temp;
                    }
                    System.out.println("Arreglo rotado: " + Arrays.toString(arreglo));
                    break;
                case 2:
                    for (int i = 0; i < nuPosiciones; i++) {
                        temp = arreglo[0];
                        for (int j = 0; j < longitud -1; j++) {
                            arreglo[j] = arreglo[j + 1];
                        }
                        arreglo[longitud - 1] = temp;
                    }
                    System.out.println("Arreglo rotado: " + Arrays.toString(arreglo));
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (opcion != 3);
    }
}

