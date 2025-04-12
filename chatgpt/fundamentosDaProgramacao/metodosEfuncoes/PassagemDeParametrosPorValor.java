package chatgpt.fundamentosDaProgramacao.metodosEfuncoes;

public class PassagemDeParametrosPorValor {

    // Quando você passa um int, double, boolean, etc., uma cópia do valor é enviada para o método. 
    // Ou seja, se você alterar o valor dentro do método, o original não muda.

    public static void mudanca (int x){

        x = x + 5;
        System.out.println("Valor dentro da função: "+ x);

    }

    public static void main (String[]args){

        int x = 10;
        mudanca(x);

        System.out.println("Valor fora da função: "+ x);

    }
    
}
