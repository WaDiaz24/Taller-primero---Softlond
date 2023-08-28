package ejercicios;
/*
Pide al usuario un número decimal y muestra su valor redondeado a un
número específico de decimales.
 */
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float number, numberRedondeado;

        System.out.print("Digite un número: ");
        number = entrada.nextFloat();

        numberRedondeado = Math.round(number);

        System.out.println("El número "+number+ " redondeado es: "+numberRedondeado);
    }
}
