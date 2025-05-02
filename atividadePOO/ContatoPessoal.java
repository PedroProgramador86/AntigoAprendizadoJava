package atividadePOO;

import java.util.Scanner;

public class ContatoPessoal extends Contato {

    Scanner tecladoPessoal = new Scanner(System.in);

    int op;
    int [] dataDeAniversario = new int[20];
    String [] endereco = new String[20];

    @Override
    public String inserirNome() {
        return super.inserirNome();
    }
    @Override
    public int inserirTelefone() {
        
        return super.inserirTelefone();
    }
    @Override
    public String inserirEmail() {
        
        return super.inserirEmail();
    }

    public int dataDeAniversario() {

        System.out.printf("Data de Aniversario: ");
        dataDeAniversario[op] = tecladoPessoal.nextInt();

        return dataDeAniversario[op];

    }

    public String endereco() {

        System.out.printf("Endereço: ");
        endereco[op] = tecladoPessoal.nextLine();

        return endereco[op];

    }

    public ContatoPessoal (int op) {

        this.op = op;

    }
    
}
