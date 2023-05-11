package fr.amu.iut.exercice1;

import javafx.application.Application;
import javafx.stage.Stage;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.control.TextField;

public class exo1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // CrÃ©ation du conteneur principal
        BorderPane borderPane = new BorderPane();

        // Menus en bas
        final Menu menu1 = new Menu("File");
        menu1.getItems().addAll(new MenuItem("New"), new MenuItem("Open"), new MenuItem("Save"), new MenuItem("Close"));

        final Menu menu2 = new Menu("Options");
        menu2.getItems().addAll(new MenuItem("Cut"), new MenuItem("Copy"), new MenuItem("Paste"));

        final Menu menu3 = new Menu("Help");

        MenuBar menuBar = new MenuBar();

        menuBar.getMenus().addAll(menu1, menu2, menu3);
        borderPane.setTop(menuBar);

        // Paddle au milieu

        //  Bouton
        HBox boutonsCentre = new HBox();

        Button submit = new Button("Submit");
        Button cancel = new Button("Cancel");

        boutonsCentre.setAlignment(Pos.CENTER);
        boutonsCentre.setSpacing(10);
        boutonsCentre.getChildren().addAll(submit, cancel);
        GridPane.setConstraints(boutonsCentre, 1, 3);

        //  Labels
        //  Name
        GridPane centre = new GridPane();
        Label name = new Label("Name :");
        GridPane.setConstraints(name, 0, 0);

        //  Email
        Label email = new Label("Email :");
        GridPane.setConstraints(email, 0, 1);

        //  Password
        Label password = new Label("Password :");
        GridPane.setConstraints(password, 0, 2);

        // Text fields
        //
        TextField tName = new TextField();
        GridPane.setConstraints(tName, 1, 0);

        //
        TextField tEmail = new TextField();
        GridPane.setConstraints(tEmail, 1, 1);

        //
        TextField tPassword = new TextField();
        GridPane.setConstraints(tPassword, 1, 2);


        //  Ajout des children
        centre.getChildren().addAll(name, email, password, tName, tEmail, tPassword);
        centre.setAlignment(Pos.CENTER);
        centre.setVgap(10);
        centre.setHgap(10);

        //  VBox du centre
        VBox milieu = new VBox();

        milieu.getChildren().addAll(centre, boutonsCentre);
        milieu.setAlignment(Pos.CENTER);
        milieu.setSpacing(10);
        borderPane.setCenter(milieu);

        //  VBox de gauche
        VBox barreGauche = new VBox();

        Label boutons = new Label("Boutons : ");

        Button b1 = new Button("Bouton 1");
        Button b2 = new Button("Bouton 2");
        Button b3 = new Button("Bouton 3");

        boutons.setAlignment(Pos.CENTER);
        barreGauche.getChildren().addAll(boutons, b1, b2 ,b3);
        barreGauche.setAlignment(Pos.CENTER);
        barreGauche.setSpacing(10);

        // Je teste la HBOX pour le separateur
        HBox barreSeparateur = new HBox();
        Separator separator = new Separator();
        separator.setOrientation(Orientation.VERTICAL);

        barreSeparateur.getChildren().addAll(barreGauche, separator);
        borderPane.setLeft(barreSeparateur);

        // CrÃ©ation du bandeau en bas de la fenÃªtre
        VBox bottomControls = new VBox();
        Separator separatorBas = new Separator();

        separatorBas.setOrientation(Orientation.HORIZONTAL);

        Label labeltextuel = new Label("Ceci est un label de bas de page ");

        HBox.setHgrow(labeltextuel, Priority.ALWAYS);

        bottomControls.setAlignment(Pos.CENTER);

        bottomControls.getChildren().addAll(separatorBas, labeltextuel);
        borderPane.setBottom(bottomControls);


        // Ajout du conteneur Ã  la scene
        Scene scene = new Scene(borderPane);

        // Ajout de la scene Ã  la fenÃªtre et changement de ses paramÃ¨tres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("VBox and HBox App");

        // Affichage de la fenÃªtre
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}