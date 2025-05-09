package com.example.javafxintellij;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

//1. Extender a classe para a Application (do javaFX)
public class Main2 extends Application {


    public static void main (String[]args){
        Application.launch(args); //3. Adicionamos o launch com os argumentos na função principal
    }

    @Override
    public void start(Stage stagePrimary) throws Exception { //2. Adicona o metodo abstrato de Application
                            //^^^^^^^^^^ Esse aqui é o palco principal

        Group root = new Group(); //4. se cria um grupo para armazenar os nós
        Scene cena = new Scene(root); //5. é criada a cena contendo os nós criados anteriormente
        // Stage stage = new Stage();   //**. Só criamos outra cena (além da que ja está criada na start) quando queremos,
                                        // adicionar outra tela no cogigo

        //6. Por fim adicionamos a cena ao palco utilizando o metodo "setScene"
        stagePrimary.setScene(cena);
        //8. E aqui, exibimos oque foi criado
        stagePrimary.show(); //Esse metodo retorna lá na main (como foi adicionado os argumentos)

    }
}
