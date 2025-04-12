package chatgpt.funcamentosDaProgramacao;

public class UsoDoIf_Else{
    public static void main (String[]args){

        float nota = 6.2f; // Valor flutuante considerado como double. Por isso add o "f"
                           // frente do valor

        if (nota >= 7.0){

            System.out.println("Aluno Aprovado !");

        }

        else if (nota >= 5.0 && nota <= 6.9){

            System.out.println("Aluno de Recuperação !");

        }

        else{

            System.out.println("Aluno Reprovado !");

        }

    }
}