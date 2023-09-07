package ejercicios;
/*
Eliminar duplicados: Diseña un programa que elimine los elementos
duplicados de un arreglo
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arreglo[] = new int[5], resultado[];

        System.out.println("Arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print((i + 1) + ": Digite números enteros: ");
            arreglo[i] = entrada.nextInt();
        }

        ArrayList<Integer> listSinDuplicados = new ArrayList<>();
        //Creamos una lista sin los elementos duplicados
        for (int num: arreglo) {
            if(!listSinDuplicados.contains(num)) {
                listSinDuplicados.add(num);
            }
        }
        //Pasamos la lista a un nuevo arreglo
        resultado = new int[listSinDuplicados.size()];
        for (int i = 0; i < listSinDuplicados.size(); i++) {
            resultado[i] = listSinDuplicados.get(i);
        }
        System.out.println("Arreglo sin elementos duplicados: "+ Arrays.toString(resultado));
    }
}

