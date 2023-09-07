package ejercicios;
/*
Pide al usuario una frase y muestra cada palabra por separado
 */
import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String frase;
        String palabras[];

        System.out.print("Digite una frase: ");
        frase = entrada.nextLine();

        palabras = frase.split(" ");

        System.out.println("Palabras separadas");

        for (String palabra : palabras) {
            System.out.println("Las palabras de la frase son: " + palabra);
        }
    }
}
