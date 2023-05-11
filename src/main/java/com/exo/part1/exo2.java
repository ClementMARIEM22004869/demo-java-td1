package fr.amu.iut.exercice2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Random;

public class exo2 extends Application {

    private ImageView ran(){
        Random random = new Random();
        int nombre = random.nextInt(3);

        if (nombre == 0) return new ImageView("exercice2/Croix.png");
        else if (nombre == 1) return new ImageView("exercice2/Rond.png");
        else return new ImageView("exercice2/Vide.png");
    }


    @Override
    public void start(Stage primaryStage) {

        GridPane conteneur = new GridPane();

        Label l00 = new Label();
        Label l01 = new Label();
        Label l02 = new Label();
        GridPane.setConstraints(l00, 0, 0);
        GridPane.setConstraints(l01, 0, 1);
        GridPane.setConstraints(l02, 0, 2);
        l00.setGraphic(ran());
        l01.setGraphic(ran());
        l02.setGraphic(ran());

        Label l10 = new Label();
        Label l11 = new Label();
        Label l12 = new Label();
        GridPane.setConstraints(l10, 1, 0);
        GridPane.setConstraints(l11, 1, 1);
        GridPane.setConstraints(l12, 1, 2);
        l10.setGraphic(ran());
        l11.setGraphic(ran());
        l12.setGraphic(ran());


        Label l20 = new Label();
        Label l21 = new Label();
        Label l22 = new Label();
        GridPane.setConstraints(l20, 2, 0);
        GridPane.setConstraints(l21, 2, 1);
        GridPane.setConstraints(l22, 2, 2);
        l20.setGraphic(ran());
        l21.setGraphic(ran());
        l22.setGraphic(ran());

        conteneur.getChildren().addAll(l00, l01, l02, l10, l11, l12, l20, l21, l22);

        Scene scene = new Scene(conteneur);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}