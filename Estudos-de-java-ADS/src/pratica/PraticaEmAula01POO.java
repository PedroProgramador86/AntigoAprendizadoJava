public class PraticaEmAula01POO{
    public static void main (String[]args){

        CalculadoraPraticaEmAula01POO calculadora = new CalculadoraPraticaEmAula01POO();
        double soma = calculadora.soma(10,20);
        double subtracao = calculadora.subtracao(10, 20);
        double divisao = calculadora.divisao(10, 20);
        double multiplicacao = calculadora.multiplicacao(10, 20);

        // Pessoa p1 = new Pessoa();
        // p1.imprimir(); 

        System.out.println("Soma = "+soma);
        System.out.println("Subtração = "+subtracao);
        System.out.println("Divisão = "+divisao);
        System.out.println("Multiplicação = "+multiplicacao);

    }
}