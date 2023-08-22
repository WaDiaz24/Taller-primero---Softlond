package ejercicios;
/*
Crea un programa que calcule y muestre el área y el perímetro de un círculo.
El usuario debe proporcionar el radio del círculo
 */
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double radio, area, perimetro;

        System.out.print("Digite el radio del circulo: ");
        radio = entrada.nextDouble();

        area = Math.PI* Math.pow(radio, 2);
        perimetro = 2 *Math.PI * radio;
        System.out.println("El area del circulo es: "+area);
        System.out.println("El perimetro del circulo es: "+perimetro);
    }
}
