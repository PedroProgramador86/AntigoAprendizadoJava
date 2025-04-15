package chatgpt.poo.classesEobjetosPOO;

// Toda classe que forma objetos é composta pelos seguintes componentes:
// 1. Atributos (ou variaveis de instancia) - Variaveis que inicializam um objeto
// 2. Metodos - Comportamentos do objeto (Oque o objeto ira fazer)
// 3. Construtor - Inicializador do objeto 


// Primeiro de tudo é definido a classe:

// public class NomeDaClasse {
//
// }


// Depois é dado o tipo e os atributos dessa classe (que seriam também chamadas de variaveis de instancia):

// public class NomeDaClasse {
// 
// tipoDaVariavel nomeDaVariavelDeInstancia;
//
// }

// Após isso é feito o metodo (O comportamento do objeto):

// public class NomeDaClasse {
// 
// tipoDaVariavel nomeDaVariavelDeInstancia;
//
//      tipoDoMetodo nomeDoMetodo(){
//  
//          funcionalidadeDoMetodo;      
//
//      }
//
// }

// Por fim é declarado o construtor:
// O construtor recebe o nome da classe criada, 
// com as variaveis de inicialização definidas como parametros,
// e a atribuição das variaveis de instancia criadas anteriormente com as variaveis definidas no parametro do construtor

// public class NomeDaClasse {
// 
// tipoDaVariavel nomeDaVariavelDeInstancia;
//
//      tipoDoMetodo nomeDoMetodo(){
//  
//          funcionalidadeDoMetodo;      
//
//      }
//
//      public nomeDaClasseCriada (tipo1 nomeDaVariavelDeInicializacao) {
//
//          this.nomeDaVariavelDeInstancia = nomeDaVariavelDeInicializacao;
//
//      }
//}

// Exemplo pratico:

public class ComponentesDeUmaClassePobjetos { // Definição da Classe (Molde que sera construido o objeto)

    String modelo;          //  Atributos           Variaveis
    String marca;           //     do        ou        de
    int anoDeFabricacao;    //   Objeto             Instancia

    public void buzinarEdaVrau(){ // Metodo - Comportamento do objeto

        System.out.println("Vrumm vrummmm");
        System.out.println("Biiiii Biiiiii");

    }

    public ComponentesDeUmaClassePobjetos (String modeloDoObjeto, String marcaDoObjeto, int anoDeFabricacaoDoObjeto){ // Construtor Inicializador do objeto

        this.modelo = modeloDoObjeto; // "this" (esse) "modelo" (atributo do objeto) = (recebe) a variavel do construtor (modeloDoObjeto)
        this.marca = marcaDoObjeto;   
        this.anoDeFabricacao = anoDeFabricacaoDoObjeto;

    }
    
}

// Agora mostrando a main (Principal)...
