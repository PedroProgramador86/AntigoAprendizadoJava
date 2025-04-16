package chatgpt.poo.encapsulamentoPOO;

import java.util.Scanner;

public class Principal {

    public static void main (String[]args){

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite o seu nome: ");
        String nome = teclado.nextLine();

        System.out.printf("Digite sua idade: ");
        int idade = teclado.nextInt();

        UsoDoGetterESetter meusDados = new UsoDoGetterESetter(nome, idade); // Dados indo para o modelo 
                                                                            // UsoDoGetterESetter
        meusDados.imprimirDados();

        teclado.close();
    }
}