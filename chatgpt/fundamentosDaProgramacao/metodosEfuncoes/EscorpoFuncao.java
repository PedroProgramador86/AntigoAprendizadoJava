package chatgpt.fundamentosDaProgramacao.metodosEfuncoes;

// Um escorpo de uma função precisa de um tipo de retorno, o nome da função, seus parametros,
// e seu escorpo (oque ele ira executar)

// É necessario declarar um "static" na função, quando você não quer criar objetos a partir dela.
// Pois, se não, a função, só pode ser chamada atravez de um objeto (sem static), e não por ela 
// diretamente (com static)

// public static tipoderetorno NomeDaFuncao (parametros (ou variaveis)){
// 
//      escorpo (oque a função ira fazer)...
//
// }

//p.ex (utilizando o nome do arquivo desse aprendizado):

public class EscorpoFuncao{

    public static void funcacaoHelloWorld(){ // Função que não retorna nada (void) e é
                                             // chamada diretamente (não criando um objeto)
        System.out.println("Hello World");
    
    }

    public static void main (String[]args){

        funcacaoHelloWorld(); // Chamando a função

    }

}

