package ejercicios;
/*
Realiza un programa que solicite al usuario dos números enteros y muestre
su suma, resta, multiplicación y división
 */
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number1, number2, suma, resta, mult, div;

        System.out.print("Digite un número: ");
        number1 = entrada.nextInt();
        System.out.print("Digite un segundo número: ");
        number2 = entrada.nextInt();

        suma = number1 + number2;
        resta = number1 - number2;
        mult = number1 * number2;
        div = number1 / number2;

        System.out.println("La suma es: " + suma
                + "\nLa resta es: " + resta
                + "\nLa multiplicación es: " + mult
                + "\nLa división es: " + div);
    }


}
