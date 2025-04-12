package chatgpt.fundamentosDaProgramacao.arraysEvetores;

public class DeclaracaoDeArrays {
    public static void main (String[]args){

        //Declaração de Arrays:
        // tipo [] nomeDaVariavel = new tipo[tamanho];

        //p.ex:

        int [] numeros = new int[5];

        //Declaração de Arrays com valores imbutidos:
        //tipo [] nomeDaVariavel = {elemento1, elemento2, elemento3, ...};

        //p.ex:

        int [] numeros1 = {1, 2, 3, 4, 5, 6};

        //Percorrendo um array utilizando o "for"

        for(int i = 0; i<6 ; i++ ){

            System.out.println("Numeros: "+ numeros1[i]);

        }

        //Percorrendo com o for-each:

        for( int variavel : numeros1 ){

            System.out.println(variavel);

        }

    }

}
