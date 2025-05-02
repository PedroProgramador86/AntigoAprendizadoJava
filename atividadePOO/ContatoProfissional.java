package atividadePOO;

import java.util.Scanner;

public class ContatoProfissional extends Contato {

    int op;
    String [] empresa = new String[20];
    String [] cargo = new String [20];

    Scanner tecladoProfissional = new Scanner(System.in);

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

    public String empresa() {

        System.out.printf("Empresa: ");
        empresa[op] = tecladoProfissional.nextLine();

        return empresa[op];

    }

    public String cargo() {

        System.out.printf("Cargo: ");
        cargo[op] = tecladoProfissional.nextLine();

        return cargo[op];

    }

    public ContatoProfissional (int op) {

        this.op = op;

    }
    
}
