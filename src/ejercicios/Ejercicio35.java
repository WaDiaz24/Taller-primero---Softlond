package ejercicios;
/*
Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar
del 1 al 10. Usa para esto una matriz
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        int tablaMultiplicar[][] = new int[10][10];
        int mult;

        for (int i = 1; i <= tablaMultiplicar.length; i++) {
            for (int j = 1; j <= tablaMultiplicar.length; j++) {
                System.out.print("[ " + (i * j) + " ]");
                //System.out.print("[ " + i + " ]" + " x " + " [" + j + " ]" + " = " + "[ " + (i * j) + " ]");
            }
            System.out.println();
        }
    }
}

