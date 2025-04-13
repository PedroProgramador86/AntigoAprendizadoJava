package chatgpt.fundamentosDaProgramacao.exercicios;

// Solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

import java.util.Scanner;

public class Tabuada {

    public static void tabuada (int numero){

        System.out.println(numero+" x 1 = "+ numero * 1);
        System.out.println(numero+" x 2 = "+ numero * 2);
        System.out.println(numero+" x 3 = "+ numero * 3);
        System.out.println(numero+" x 4 = "+ numero * 4);
        System.out.println(numero+" x 5 = "+ numero * 5);
        System.out.println(numero+" x 6 = "+ numero * 6);
        System.out.println(numero+" x 7 = "+ numero * 7);
        System.out.println(numero+" x 8 = "+ numero * 8);
        System.out.println(numero+" x 9 = "+ numero * 9);
        System.out.println(numero+" x 10 = "+ numero * 10);

    }
    public static void main (String[]args){

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite um numero: ");
        int num = teclado.nextInt();

        teclado.close();

        tabuada(num);

    }    
}
