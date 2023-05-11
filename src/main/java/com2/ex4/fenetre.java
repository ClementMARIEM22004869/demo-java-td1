package com2.ex4;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javax.swing.text.html.StyleSheet;


public class fenetre extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private Label helloLabel;

    private TextField nameField;

    // Gestionnaire d'évènements appelé lors du clic sur le bouton
    EventHandler<MouseEvent> buttonClickHandler = actionEvent -> {
        helloLabel.setText( "choisi "+nameField.getText() +"fois");
    };

    @Override
    public void start(Stage primaryStage) throws Exception {

        // CrÃ©ation du conteneur principal
        BorderPane borderPane = new BorderPane();

        // Création d'un conteneur VBox avec ses éléments centrés
        VBox vbox = new VBox();
        vbox.setAlignment( Pos.CENTER );

        // Création et ajout du label au conteneur
        Label helloLabel = new Label();
        vbox.getChildren().add( helloLabel );

        // CrÃ©ation du bandeau en bas de la fenÃªtre

        VBox bottomControls = new VBox();
        Separator separatorTop = new Separator();

        separatorTop.setOrientation(Orientation.HORIZONTAL);

        Label labeltextuel = new Label("choisi ");

        HBox.setHgrow(labeltextuel, Priority.ALWAYS);

        bottomControls.setAlignment(Pos.CENTER);

        bottomControls.getChildren().addAll(separatorTop, labeltextuel);
        borderPane.setTop(bottomControls);

        //  Bouton
        HBox boutonsCentre = new HBox();

        Button Vert = new Button("Vert");
        Button Rouge = new Button("Rouge");
        Button Blue = new Button("Blue");

        boutonsCentre.setAlignment(Pos.CENTER);
        boutonsCentre.setSpacing(10);
        boutonsCentre.setPadding(new Insets(10));
        boutonsCentre.getChildren().addAll(Vert, Rouge, Blue);
        GridPane.setConstraints(boutonsCentre, 1, 3);

        HBox.setHgrow(boutonsCentre, Priority.ALWAYS);

        // Changement du texte après un clic sur le bouton
        Pane canvas = new Pane();
        canvas.setPrefSize(400,200);
        borderPane.setCenter(canvas);

        Vert.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            canvas.setStyle("-fx-background-color:green;");
        });
        Rouge.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            canvas.setStyle("-fx-background-color:red;");
        });
        Blue.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
            canvas.setStyle("-fx-background-color:blue;");
        });

        //compteur

        //change titre
        // Changement du texte après un clic sur le bouton
        int cptblue =0;
        int cptrouge =0;
        int cptvert =0;

        if ("Blue".equals(true)) {
            ++cptblue;
            int finalCptblue = cptblue;
            Blue.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
                helloLabel.setText("Blue choisi " + finalCptblue + "fois");
            });

            // Changement du texte après un clic sur le bouton
            boutonsCentre.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> handleButonClick(actionEvent));
        } else if ("Rouge".equals(true)) {
            ++cptrouge;
            int finalCptrouge = cptrouge;
            Blue.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
                helloLabel.setText("Blue choisi " + finalCptrouge + "fois");
            });

            // Changement du texte après un clic sur le bouton
            boutonsCentre.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> handleButonClick(actionEvent));
        } else if ("Vert".equals(true)) {
            ++cptvert;
            int finalCptvert = cptvert;
            Blue.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
                helloLabel.setText("Blue choisi " + finalCptvert + "fois");
            });

            // Changement du texte après un clic sur le bouton
            boutonsCentre.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> handleButonClick(actionEvent));
        }
        HBox.setHgrow(labeltextuel, Priority.ALWAYS);

        // Création de la scene
        borderPane.setBottom(boutonsCentre);
        Scene scene = new Scene(borderPane);

        // Ajout de la scene à la fenêtre
        primaryStage.setScene( scene );

        primaryStage.setTitle("Hello application");
        primaryStage.show();
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);
    }

    private void handleButonClick(MouseEvent actionEvent) {
        helloLabel.setText( "Bonjour à toi, "+nameField.getText() );
    }
}
