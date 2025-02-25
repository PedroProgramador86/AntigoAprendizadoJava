import java.util.Scanner;
public class Atividade01POO{
    public static void main (String[]args){

        try (Scanner teclado = new Scanner ( System . in )) {
            double x1 , y1 , x2 , y2 , distancia;

            System . out . println (" Entre com as coordenadas x e y, Respectivamente :"); 
            x1 = teclado . nextFloat ();
            y1 = teclado . nextFloat ();
            x2 = teclado . nextFloat ();
            y2 = teclado . nextFloat ();

            distancia = Math . pow ( Math . pow ( x2 - x1 , 2) + Math . pow ( y2 - y1 , 2) ,1/2) ;
            
            System . out . println ("A distancia e: " +distancia) ;
        }
        

    }
}