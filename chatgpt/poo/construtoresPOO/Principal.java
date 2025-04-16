package chatgpt.poo.construtoresPOO;

import java.util.Scanner;

public class Principal {

    public static void main (String[]args){

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite o seu nome: ");
        String nome = teclado.nextLine();

        System.out.printf("Digite a sua idade: ");
        int idade = teclado.nextInt();

        Construtor meusDados = new Construtor(nome, idade);

        meusDados.imprimirDados();

        teclado.close();

    }
    
}
