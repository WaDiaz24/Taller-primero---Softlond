package ejercicios;
/*
Realiza un programa que simule un juego de adivinar un número. El
programa debe generar un número aleatorio entre 1 y 100, y el usuario debe
adivinarlo. El programa debe indicar si el número ingresado es mayor o
menor que el número a adivinar
 */
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number, numeroAleatorio;
        numeroAleatorio = (int) (Math.random() * 100);

        System.out.print("Digite un número: ");
        number = entrada.nextInt();

        do {
            if (number < numeroAleatorio) {
                System.out.println("Digite un número mayor");
                number = entrada.nextInt();
            } else {
                System.out.println("Digite un número menor");
                number = entrada.nextInt();
            }
        } while (number != numeroAleatorio);
        System.out.println("Felicidades encontro el número");
    }
}
