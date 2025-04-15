package chatgpt.poo.atributosPOO;

// Atributos são as caracteristicas que cada objeto carrega
// -> Variaveis que pertencem a cada objeto criado

//p.ex:

public class Atributos {

    String nome;
    String raca;
    int idade;

    // Construtores tem uma relação com esses atributos criados
    // (Até um porquê, são elas que inicializam um objeto)
    public Atributos(String nome, String raca, int idade){

        this.nome = nome;
        this.raca = raca;
        this.idade = idade;

    }
    
}
