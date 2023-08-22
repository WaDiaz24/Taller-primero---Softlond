package ejercicios;
/*
Escribe un programa que solicite al usuario un número entero positivo y
calcule su factorial.
 */
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double number, factorial = 1;

        System.out.print("Digite un número positivo: ");
        number = entrada.nextDouble();

        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("El factorial es: "+factorial);
        }else{
            System.out.println("El número no es positivo");
        }
    }
}
