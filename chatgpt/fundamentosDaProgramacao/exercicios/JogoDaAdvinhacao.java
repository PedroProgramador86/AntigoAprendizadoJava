package chatgpt.fundamentosDaProgramacao.exercicios;

// Faça um programa que gere um número aleatório entre 1 e 100. O usuário deve tentar adivinhar o número.
// A cada tentativa, o programa deve dizer se o número é maior ou menor que o chute.
// O jogo continua até o usuário acertar.

import java.util.Scanner;
import java.util.Random;

public class JogoDaAdvinhacao {

    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);
        Random geradorAleatorio = new Random();

        int tentativa = 0;
        int valorDaTentativa;

        System.out.println("========== Jogo da Adivinhação ==========");

        int numeroMisterioso = geradorAleatorio.nextInt(100) + 1;

        do {

            System.out.printf("Tentativa %dº: ", tentativa + 1);
            valorDaTentativa = teclado.nextInt();

            tentativa++;

            if(valorDaTentativa > numeroMisterioso){

                System.out.println("O numero é maior que o digitado");

            }

            else if(valorDaTentativa < numeroMisterioso){

                System.out.println("O numero é menor que o digitado");

            }

            else{

                System.out.printf("Você acertou com %d tentativas !", tentativa);

            }


        } while(valorDaTentativa != numeroMisterioso);



    }
    
}
