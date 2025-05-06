package atividadePOO;

import java.util.Scanner;

public class Console {

    public static void main (String[]args){

        Agenda agenda = new Agenda();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1 - Adicionar Contato");
            System.out.println("2 - Remover Contato");
            System.out.println("3 - Buscar Contato");
            System.out.println("4 - Listar Contatos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("Tipo (1 - Pessoal, 2 - Profissional): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    if (tipo == 1) {
                        System.out.print("Aniversário: ");
                        String aniversario = scanner.nextLine();
                        System.out.print("Endereço: ");
                        String endereco = scanner.nextLine();
                        agenda.adicionarContato(new ContatoPessoal(nome, telefone, email, aniversario, endereco));
                    } else {
                        System.out.print("Empresa: ");
                        String empresa = scanner.nextLine();
                        System.out.print("Cargo: ");
                        String cargo = scanner.nextLine();
                        agenda.adicionarContato(new ContatoProfissional(nome, telefone, email, empresa, cargo));
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome do contato a remover: ");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;

                case 3:
                    System.out.print("Digite o nome, telefone ou email para buscar: ");
                    String termo = scanner.nextLine();
                    var encontrados = agenda.buscarContatos(termo);
                    if (encontrados.isEmpty()) {
                        System.out.println("Nenhum contato encontrado.");
                    } else {
                        for (Contato c : encontrados) {
                            System.out.println(c.getDetalhes());
                        }
                    }
                    break;

                case 4:
                    agenda.listarContatos();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();

    }

}