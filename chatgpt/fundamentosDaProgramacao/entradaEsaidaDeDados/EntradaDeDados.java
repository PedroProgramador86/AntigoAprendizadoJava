package chatgpt.fundamentosDaProgramacao.entradaEsaidaDeDados;

// Etapas para capturar dados:
// 1. Voce importa o scanner;
// 2. Voce cria um objeto atraves desse scanner;
// 3. Voce ja pode ler os dados

//p.ex:

import java.util.Scanner; // Importando a biblioteca scanner

public class EntradaDeDados {

    public static void main (String[]args){

        // Modelo de criar um objeto do scanner:
        // Scanner nomeQueVaiSerDadoAoScanner = new Scanner(System.in);
        //                                                      ^
        //                                         Aqui fala que o scanner vai receber
        //                                         dados do teclado (System) = "Sistema"
        //                                                              (in) = "Recebe"

        Scanner teclado = new Scanner(System.in); // Criando Scanner

        // Para de fato receber os dados, você precisa armazena-los em uma variavel (Criar uma variavel)
        // Depois atribuir a mensão do nome que foi dado ao Scanner na hora de criar o objeto (teclado)
        // E por fim adicionar uma função do proprio Scanner que faz a leitura da proxima linha 
        // Essa leitura vai variar dependendo do tipo:
        // 
        // String    ->   nextLine();
        // ini       ->   nextInt();          ->        Obs: nextInt() não consome quebra de linha,
        // double    ->   nextDouble();                 por isso quando for utilizar um nextInt() antes
        // float     ->   nextFloat();                  de um nextLine()... é sempre bom colocar um
        // boolean   ->   nextBoolean();                nextInt() antes, para ele consumir a linha do
        // char      ->   next().charAt(0);             nextInt() anterior.

        String nome;

        System.out.printf("Digite o seu nome: ");
        nome = teclado.nextLine(); // Usando Strigs

        int idade;

        System.out.printf("Digite a sua idade: ");
        idade = teclado.nextInt();

        double vDouble;

        System.out.printf("Digite um valor Double: ");
        vDouble = teclado.nextDouble();

        float media;
        
        System.out.printf("Digite a sua media: ");
        media = teclado.nextFloat();

        boolean vORf;

        System.out.printf("Verdadeiro (True) ou Falso (False) ? ");
        vORf = teclado.nextBoolean();

        char sexo;

        System.out.printf("Sexo (M) ou (F): ");
        sexo = teclado.next().charAt(0);

        System.out.println("========== Dados Lidos ==========");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Valor Double: "+ vDouble);
        System.out.println("Media: "+ media);
        System.out.println("Booleano "+ vORf);
        System.out.println("Sexo: "+ sexo);

        teclado.close(); //Fecha o Scanner

    }
    
}
