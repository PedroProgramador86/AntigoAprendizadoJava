package chatgpt.fundamentosDaProgramacao.exercicios;

// Peça um número inteiro e calcule o fatorial dele (ex: 5! = 5×4×3×2×1).

import java.util.Scanner;

public class Fatorial {

    public static int calculoFatorial (int numero) {

        int i;
        int resultado = 1;

        for( i=numero ; i > 1 ; i-- ){

            resultado *= i;

        }

        return resultado;

    }

    public static void main (String[]args){

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite um numero: ");
        int n = teclado.nextInt();

        int fatorial;
        fatorial = calculoFatorial(n);

        System.out.println("O Fatorial do numero "+ n +" equivale a "+ fatorial);

        teclado.close();
    }
}
