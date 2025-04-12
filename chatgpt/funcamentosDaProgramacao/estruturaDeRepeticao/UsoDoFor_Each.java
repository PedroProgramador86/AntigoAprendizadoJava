package chatgpt.funcamentosDaProgramacao.estruturaDeRepeticao;

public class UsoDoFor_Each {
    public static void main (String[]args){

        String[] nomes = {"Ana", "Bruno", "Carlos"};

        for (String nome : nomes) {
        
            System.out.println("Nome: " + nome);
        
        }

    } // "For each" doesn't care about indexes
    
}
