package ejercicios;
/*
Frecuencia de elementos: Escribe un programa que cuente la frecuencia de
cada elemento en un arreglo.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arreglo[] = new int[5], numero, indice = 0;

        System.out.println("Arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i + 1) + ": Digite números enteros: ");
            arreglo[i] = entrada.nextInt();
        }
        // Usamos un mapa para almacenar la frecuencia de los elementos
        Map<Integer, Integer> frecuencia = new HashMap<>();

        // Contamos la frecuencia de cada elemento en el arreglo
        for (int num : arreglo) {
            if (frecuencia.containsKey(num)) {
                frecuencia.put(num, frecuencia.get(num) + 1);
            } else {
                frecuencia.put(num, 1);
            }
        }

        // Mostramos la frecuencia de cada elemento
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            System.out.println("El elemento " + entry.getKey() + " aparece " + entry.getValue() + " veces.");
        }
    }
}

