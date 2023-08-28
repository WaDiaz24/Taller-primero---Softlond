package ejercicios;

import java.util.Scanner;
/*
 Escribe un programa que calcule el área de un triángulo utilizando la fórmula
de Herón. El usuario debe ingresar las longitudes de los tres lados.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double lado1, lado2, lado3,semiperimetro, area;

        System.out.print("Digite el lado 1: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado 2: ");
        lado2 = entrada.nextDouble();
        System.out.print("Digite el lado 2: ");
        lado3 = entrada.nextDouble();

        semiperimetro = (lado1 + lado2 + lado3) / 2;
        area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));

        System.out.println("El area del triangulo es: " + area);
    }
}
