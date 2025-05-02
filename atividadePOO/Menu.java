package atividadePOO;

import java.util.Scanner; // Importando Scanner

public class Menu { // Declarando classe menu
    public static void main (String[]args){ // Metodo Principal (Contato direto com o usuario)

        Scanner tecladoMenu = new Scanner(System.in); // Criando objeto de scanner

        boolean loop = true;

        while (loop) {
        
            // Menu: 

            System.out.println("========== AGENDA DE CONTATOS ==========\n");
            System.out.println("[1] - Adicionar Contato");
            System.out.println("[2] - Remover Contato");
            System.out.println("[3] - Listar Contatos");
            System.out.println("[4] - Buscar Contato");
            System.out.println("[5] - Sair");
            System.out.printf("\nUser:");
            int op_user = tecladoMenu.nextInt(); // Lê a opção do usuario

            switch (op_user) {

                case 1: // Adicionar contato

                    //... Listas de locais disponiveis
                    System.out.println("Listando Supostos locais disponiveis");
                    System.out.printf("User: ");
                    int op_local = tecladoMenu.nextInt();
                    Agenda adicionarContatoAgenda = new Agenda(op_local); // Criando objeto de Agenda para caso 1

                    adicionarContatoAgenda.Agenda.// Chamando objeto com função


                break; // Op 1

                case 2: // Remover contato



                break; // Op 2

                case 3: // Listar contato



                break; // Op 3

                case 4: // Buscar contato



                break; // Op 4

                case 5: // Opção de Sair
                
                    loop = false;   // Encerra o loop
                    tecladoMenu.close(); // fecha o teclado
                    
                break; // Op 5
            
                default: // Caso digitar um caractere fora dos parametros do menu

                    System.out.println("Opção Invalida ! ");
                    System.out.println("Digite novamente");
                    System.out.println("\n");

                break; // Op default
            }

        } // Final do while

    } // Final do metodo principal
    
} // Final da classe principal
