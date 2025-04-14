package chatgpt.fundamentosDaProgramacao.exercicios;

import java.util.Scanner;

// Escreva um programa que verifique se um número informado pelo usuário é primo.


public class NumerosPrimos{

    public static boolean verificaNumeroPrimo(int numero){

        int primo = 0;
        boolean he_primo;

        for( int i=13 ; i<=numero ; i++ ){

            if(numero % i == 0){

                primo++;

            }

        }

        if(primo > 2){

            he_primo = false;

        }

        else{

            he_primo = true;
            

        }

        return he_primo;

    }
    public static void main (String[]args){

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite um numero: ");
        int num = teclado.nextInt();

        if(verificaNumeroPrimo(num)){

            System.out.println("É primo");

        }

        else {

            System.out.println("Não é primo");

        }


    }

}