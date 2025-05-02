package atividadePOO;

public class Agenda {

    int opcaoDoUser;

    Contato adicionarContatoAgenda = new Contato(opcaoDoUser);
    adicionarContatoAgenda.inserirNome();

    //public void listarContatos () { // Função de listar contatos:

        // Pegar objeto da classe contato

    //}

    public Agenda (int opcaoDoUser) {// Construtor
    
        this.opcaoDoUser = opcaoDoUser;

    }    

}
