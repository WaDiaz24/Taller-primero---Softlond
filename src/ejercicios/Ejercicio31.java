package ejercicios;
/*
Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo,
el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros
de manera ascendente
 */

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arreglo[] = new int[5], valorMinimo, auxTem;

        System.out.println("Arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i + 1) + ": Digite números enteros: ");
            arreglo[i] = entrada.nextInt();
        }

        // método de ordenamiento por seleccion
        for (int i = 0; i < arreglo.length-1; i++) {
            valorMinimo = i;
            for (int j = i+1; j < arreglo.length; j++) {
                if(arreglo[j] < arreglo[valorMinimo]) {
                    valorMinimo = j;
                }
            }
            auxTem = arreglo[valorMinimo];
            arreglo[valorMinimo] = arreglo[i];
            arreglo[i] = auxTem;
        }
        System.out.println("Números ordenados");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]+", ");
        }
    }
}

