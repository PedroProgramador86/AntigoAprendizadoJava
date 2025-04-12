package chatgpt.fundamentosDaProgramacao.metodosEfuncoes;



public class FuncaoComRetorno {

    public static int funcaoSoma (int a, int b){

        return a + b;
    
    }

    public static void main (String[]args){

        int a = 2;
        int b = 3;
        int resultado;

        resultado = funcaoSoma(a, b); // Pode declarar uma variavel recebendo a função com os
                                      // determinados valores

        System.out.println("A soma é igual a "+ resultado); // Resultado pela variavel recebendo função

        System.out.println("A soma é igual a "+ funcaoSoma(a, b)); // Como também pode colocar a função
                                                                   // de imediato

    }
    
    
}
