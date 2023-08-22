package ejercicios;
/*
Ejercicio 10: Crea un programa que muestre los primeros 20 números de la
serie Fibonacci. La serie Fibonacci se forma sumando los dos números
anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …
 */
public class Ejercicio10 {
    public static void main(String[] args) {

        int primero = 0,segundo = 1, siguiente;

        System.out.println("Los primeros 20 números de la serie Fibonacci son:");

        for (int i = 0; i < 20; i++) {
            System.out.print(primero + ", ");
            siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }
}
