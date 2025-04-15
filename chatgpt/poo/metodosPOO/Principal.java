package chatgpt.poo.metodosPOO;

import java.util.Scanner;

public class Principal {
    public static void main (String[]args){

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite o nome do seu cachorro: ");
        String nomeCachorro = teclado.nextLine();

        System.out.printf("Digite a idade desse cachorro: ");
        int idadeCachorro = teclado.nextInt();

        Metodos meuCachorro = new Metodos(nomeCachorro, idadeCachorro);

        boolean loop = true;

        while (loop) {
            
            int escolha;

            System.out.println("Digite oque você deseja fazer: ");
            System.out.println("[ 1 ] - Fazer cachorro latir");
            System.out.println("[ 2 ] - Fazer aniversario do cachorro");
            System.out.println("[ 3 ] - Sair do programa");
            escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                
                    meuCachorro.latir();

                    break;

                case 2:

                    meuCachorro.fazerAniversario();

                    break;

                case 3:

                    loop = false;

                    break;
            
                default:

                    System.out.println("Opção Invalida !");

                    break;
            }

            

        }

        teclado.close();

    }
    
}
