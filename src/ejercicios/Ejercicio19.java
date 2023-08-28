package ejercicios;
/*
Escribe un programa que solicite al usuario su nombre y luego lo imprima en
mayúsculas y minúsculas
 */

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String name;

        System.out.print("Digite su nombre: ");
        name = entrada.next();

        System.out.println("Su nombre es: "+name.toUpperCase());
        System.out.println("Su nombre es: "+name.toLowerCase());
    }
}
