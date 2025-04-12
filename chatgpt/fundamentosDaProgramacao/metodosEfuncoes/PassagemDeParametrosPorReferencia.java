package chatgpt.fundamentosDaProgramacao.metodosEfuncoes;

public class PassagemDeParametrosPorReferencia {

    // Se você passar um array ou objeto, a referência é passada.
    // Isso significa que se você modificar o conteúdo, ele muda fora do método também.

    public static void funcaoModificadora(int [] arraymodificando){

        arraymodificando[0] = 999;

    }
    public static void main (String[]args){

        int [] meuarray = {2, 4, 8};
        funcaoModificadora(meuarray);
        System.out.println(meuarray[0]);

    }
    
}
