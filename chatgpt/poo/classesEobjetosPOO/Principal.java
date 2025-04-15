package chatgpt.poo.classesEobjetosPOO;

import java.util.Scanner;

public class Principal {

    public static void main (String[]args){

        Scanner teclado = new Scanner(System.in);

        // Variaveis lidas do teclado levadas para o objeto:

        String meuModeloDeCarro;
        String minhaMarcaDeObjetoDeCarro;
        int anoDeFabricacaoDoMeuCarro;

        System.out.printf("Digite o modelo do carro: ");
        meuModeloDeCarro = teclado.nextLine();

        System.out.printf("Digite a marca do carro: ");
        minhaMarcaDeObjetoDeCarro = teclado.nextLine();

        System.out.printf("Digite o ano de fabricação: ");
        anoDeFabricacaoDoMeuCarro = teclado.nextInt();

        ComponentesDeUmaClassePobjetos meuCarro = new ComponentesDeUmaClassePobjetos(meuModeloDeCarro, minhaMarcaDeObjetoDeCarro, anoDeFabricacaoDoMeuCarro);

        System.out.println("Modelo: "+ meuCarro.modelo);
        System.out.println("Marca: "+ meuCarro.marca);
        System.out.println("Modelo: "+ meuCarro.anoDeFabricacao);

        meuCarro.buzinarEdaVrau();

        teclado.close();

    }
    
}
