package chatgpt.poo.construtoresPOO;

public class Construtor {
    
    String nome;
    int idade;

    public void imprimirDados(){

        System.out.println("Nome digitado: "+ nome);
        System.out.println("Idade registrada: "+ idade);

    }

    public Construtor (String nome, int idade){ // Criação do construtor (ele não possui tipo e nem void)

        this.nome = nome;          // Atribuindo variaveis do
        this.idade = idade;        // construtor para variaveis do modelo

        // A palavra-chave this se refere ao próprio objeto.
        // Serve, por exemplo, para diferenciar entre o parâmetro e o atributo

    }

}
