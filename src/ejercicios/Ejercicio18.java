package ejercicios;
/*
Crea un programa que genere una contraseña aleatoria de 8 caracteres que
contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la
clase Math para generar números aleatorios y la clase String para manipular
la contraseña
 */

import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {
        String password;
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int longitud = 8, indice;
        char caracter;

        StringBuilder passwordGenerada = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            indice = random.nextInt(caracteres.length());
            caracter = caracteres.charAt(indice);
            passwordGenerada.append(caracter);
        }
        password = passwordGenerada.toString();
        System.out.println("Contraseña generada: "+password);
    }
}
