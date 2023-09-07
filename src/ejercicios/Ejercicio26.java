package ejercicios;
/*
Escribe un programa que pida al usuario una cadena y muestre cuántos
caracteres tiene sin contar los espacios en blanco
 */
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cadena;
        int contador = 0;

        System.out.print("Digite una cadena: ");
        cadena = entrada.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) != ' ') {
                contador++;
            }
        }
        System.out.println("La cadena tiene "+contador+" caracteres");
    }
}
