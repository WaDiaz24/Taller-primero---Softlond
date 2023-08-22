package ejercicios;
/*
Crea un programa que pida al usuario un número entero positivo y muestre
su tabla de multiplicar hasta el 10.
 */
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int number;

        System.out.print("Digite un número: ");
        number = entrada.nextInt();

        if (number > 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }else{
            System.out.println("El número no es positivo");
        }
    }
}
