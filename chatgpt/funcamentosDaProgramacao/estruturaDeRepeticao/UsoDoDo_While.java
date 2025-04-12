package chatgpt.funcamentosDaProgramacao.estruturaDeRepeticao;

public class UsoDoDo_While {

    public static void main (String[]args){

        int i = 0;

        do {

            System.out.println("Valor de i: "+ i);

            i++;

        } while (i < 5);

    }
    
}

// Semelhante ao while, mas a verificação acontece depois da execução.
// Ou seja, o bloco é executado pelo menos uma vez.
