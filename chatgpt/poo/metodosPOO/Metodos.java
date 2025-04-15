package chatgpt.poo.metodosPOO;

public class Metodos {

    String nome;
    int idade;

    public void latir (){

        System.out.println(nome + "está latindo !");
        System.out.println("auauuuuuuuuu !");

    }

    public void fazerAniversario (){

        idade++;
        System.out.println("Agora "+ nome +" tem "+ idade +" anos!");

    }

    public Metodos(String nome, int idade){

        this.nome = nome;
        this.idade = idade;

    }
    
}
