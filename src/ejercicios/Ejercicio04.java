package ejercicios;
/*
Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad
o menor de edad
 */
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int edad;

        System.out.print("Digite su edad: ");
        edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("El usuario es mayor de edad");
        }else if (edad >= 0 && edad <18){
            System.out.println("El usuario es menor de edad");
        }else{
            System.out.println("No existe una edad menor a 0");
        }
    }
}
