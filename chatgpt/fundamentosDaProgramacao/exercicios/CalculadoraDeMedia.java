package chatgpt.fundamentosDaProgramacao.exercicios;

// Escreva um programa que receba três notas (valores float) e calcule a média delas.
// Depois, exiba a média e diga se o aluno foi aprovado (média ≥ 7) ou reprovado.

import java.util.Scanner;

public class CalculadoraDeMedia{

    public static void verificaMedia(float nota1, float nota2, float nota3){

        float resultado;

        resultado = (nota1 + nota2 + nota3) / 3;

        if (resultado >= 7){

            System.out.println("Aprovado");

        }

        else if(resultado < 7 && resultado >= 5){

            System.out.println("Recuperação");

        }

        else{

            System.out.println("Reprovado");

        }

    }
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);

        String nome;
        float n1, n2, n3;
        float resultadoFinal;

        System.out.printf("Digite o nome do Aluno: ");
        nome = teclado.nextLine();

        System.out.printf("Digite a primeira nota: ");
        n1 = teclado.nextFloat();

        System.out.printf("Digite a segunda nota: ");
        n2 = teclado.nextFloat();

        System.out.printf("Digite a terceira nota: ");
        n3 = teclado.nextFloat();

        teclado.close();

        System.out.println("Nome do Aluno: "+ nome);
        System.out.print("Status: ");
        verificaMedia(n1, n2, n3);

    }

}