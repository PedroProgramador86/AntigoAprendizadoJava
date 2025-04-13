

package chatgpt.fundamentosDaProgramacao.exercicios;

// Escreva um programa que leia uma temperatura em Celsius e converta para Fahrenheit.
// Fórmula: F = (C * 9/5) + 32

import java.util.Scanner;

public class ConversorDeTemperatura {

    public static float convertetemperatura(float temp){

        double fahrenheit;

        //fahrenheit = (temp * 9/5) + 32;

        return (temp * 1.8f) + 32;

    }
    public static void main (String[]args){

        Scanner teclado = new Scanner(System.in);

        float temperatura;

        System.out.printf("Digite a temperatura em graus Celcius: ");
        temperatura = teclado.nextFloat();

        float resultado = convertetemperatura(temperatura);

        System.out.printf("A temperatura convertida em fahrenheit é igual a: %.2f", resultado);

        teclado.close();

    }
}
