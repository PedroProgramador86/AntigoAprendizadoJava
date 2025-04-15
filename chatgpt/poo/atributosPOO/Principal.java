package chatgpt.poo.atributosPOO;

public class Principal {

    public static void main (String[]args){

        Atributos dog1 = new Atributos("Bolt", "Pastor Alemão", 4);
        Atributos dog2 = new Atributos("Safira", "Pintcher", 12);
        Atributos dog3 = new Atributos("Angelina", "Pintcher", 9);

        System.out.println(dog1.nome + dog1.raca + dog1.idade);
        System.out.println(dog2.nome + dog2.raca + dog2.idade);
        System.out.println(dog3.nome + dog3.raca + dog3.idade);


    }
    
}
