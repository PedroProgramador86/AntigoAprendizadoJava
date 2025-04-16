package chatgpt.poo.encapsulamentoPOO;
// Cenario: 
// Quando um atributo é público (public), qualquer parte do código pode mudar ele diretamente,
// mesmo colocando valores inválidos. Isso pode quebrar o funcionamento do seu programa.

//p.ex:

/////////////////////////////////////////////////////////////////////////////////////////////////

// public class Pessoa { -> Modelo chamado pessoa
//  
//    public String nome;
//    public int idade;
//
// }

// Na classe Principal (main):

// public static Principal {
//      
//      public class main (String[]args){
//      
//          Pessoa p = new Pessoa();
//          p.nome = "João";
//          p.idade = -10; // -> Isso não faz sentido!
//
//      }
// }

/////////////////////////////////////////////////////////////////////////////////////////////////

// Já utilizando o private + getter & setter isso muda, veja detalhadamente:

public class UsoDoGetterESetter{ //Primeiro Criamos a classe

    private String nome; // Depois atribuimos as variaveis de instacia como modo privado
    private int idade;

    // No inicio todo do modelo, o construtor trás os dados da classe principal:

    public UsoDoGetterESetter(String nome, int idade){ // Construtor

        setNome(nome);          //setNome puxando a variavel nome do construtor
        setIdade(idade);        //setIdade puxando a variavel idade do construtor

    }

    

    // Em seguida, criamos o setter
    // Ele serve para inspecionar e modificar a variavel que foi pedida la na classe principal (main)

    public void setNome(String nome_vindo_do_construtor){

        nome = nome_vindo_do_construtor; // agora a variavel de instancia "nome" recebe a variavel
                                         // "nome" do construtor
    }

    public void setIdade(int idade_vinda_do_construtor){

        if(idade_vinda_do_construtor >= 0){

            idade = idade_vinda_do_construtor;  // agora a variavel de instancia "idade" recebe a variavel
                                                // "idade" do construtor

        }

        else{

            System.out.println("Idade Invalida !"); // Verifica se há algum erro
        }
        

    }

    // Agora criamos o getter para o nome e a idade vindas do setter

    public String getNome(){

        return nome;                // O getter retorna o nome
                                    // (pois o nome era privado e agora se torna publico
                                    // depois da modificação) - Ou seja, ele pode ser visualizado
                                    // fora da classe (no caso o modelo UsoDoGetterESetter)
    }

    public int getIdade(){          // Mesma coisa com a idade ...

        return idade;
    }

    public void imprimirDados (){ // Por fim, criamos uma função para imprimir os dados adquiridos

        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+ getIdade());

    }


}