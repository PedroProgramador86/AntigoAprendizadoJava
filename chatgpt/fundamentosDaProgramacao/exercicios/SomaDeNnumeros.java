package chatgpt.fundamentosDaProgramacao.exercicios;

// Peça um número N ao usuário. Depois, leia N números e mostre a soma total deles.

import java.util.Scanner;

public class SomaDeNnumeros {

    public static int funcaoRepetidora(int numero){

        Scanner tecladoFuncaoRepetidora = new Scanner(System.in);
        int i;
        int [] vetor = new int [numero];
        int valorDeCaptura;
        int valorSoma = 0;

        for( i=0 ; i<numero ; i++ ){

            System.out.printf("Digite o %dº valor: ", i + 1);
            valorDeCaptura = tecladoFuncaoRepetidora.nextInt();
            valorSoma += valorDeCaptura;

        }
        
        tecladoFuncaoRepetidora.close();

        return valorSoma;

    }
    public static void main (String[]args){

        Scanner tecladoMain = new Scanner(System.in);

        System.out.printf("Digite a quantidade de numeros: ");
        int quantidade = tecladoMain.nextInt();

        int resposta = funcaoRepetidora(quantidade);

        System.out.printf("O valor total é igual a : %d", resposta);

        tecladoMain.close();

    }
    
}
