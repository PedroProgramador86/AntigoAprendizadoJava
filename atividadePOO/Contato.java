package atividadePOO;

import java.util.Scanner;

public class Contato {

    Scanner tecladoContato = new Scanner(System.in);

    int op; // Opção de lugar para adicionar um usuario

    String [] nome = new String[50]; // Criando arrray para nome
    int [] telefone = new int[20]; // Criando arrray para telefone
    String [] email = new String[20]; // Criando arrray para email

    public String inserirNome () { // Função para inserir nome

        //op = op_descrito;
        System.out.printf("Nome: ");
        nome[op] = tecladoContato.nextLine();

        return nome[op];

    }

    public int inserirTelefone () { // Função para inserir telefone

        System.out.printf("Telefone: ");
        telefone[op] = tecladoContato.nextInt();

        return telefone[op];

    }

    public String inserirEmail () { // Função para inserir email

        System.out.printf("E-mail: ");
        email[op] = tecladoContato.nextLine();

        return email[op]; 

    }

    public Contato (int op) {// Construtor para receber a posição para adicionar um contato;
        
        this.op = op;

    }

}