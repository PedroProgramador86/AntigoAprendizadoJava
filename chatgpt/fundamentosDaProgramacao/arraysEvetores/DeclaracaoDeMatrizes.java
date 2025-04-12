package chatgpt.fundamentosDaProgramacao.arraysEvetores;

public class DeclaracaoDeMatrizes {
    public static void main (String[]args){

        //Declaração e criação de uma matriz:
        // tipo [][] nomeDaVariavel = new tipo [tamanho][tamanho];

        int[][] matriz = new int [3][3];

        //Declaração com os valores ja atribuidos:
        // tipo[][] nomeDaVariavel = {
        //
        //          {valoror1, valor2, ...},
        //          {valoror1, valor2, ...},
        //          {valoror1, valor2, ...}
        // };

        // p.ex:

        int [][] matriz1 = {
    
            {23, 34, 45}, 
            {65, 43, 54},
            {21, 34, 87}
    
        };


        for( int i=0 ; i<3 ; i++ ){
            for( int j=0 ; j<3 ; j++ ){

                System.out.println(matriz1[i][j]);

            }
        }

    }
    
}
