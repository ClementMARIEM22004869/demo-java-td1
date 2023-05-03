package com.exo.exo1;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sun.tools.jconsole.inspector.XTextFieldEditor;

import javax.swing.plaf.metal.MetalIconFactory;

public class borderPane extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Création du conteneur principal
        BorderPane borderPane = new BorderPane();

        // Création du conteneur correspondant à la ligne de contrôle haut dessus du tableau
        Menu Help = new Menu("Help");

        MenuItem New = new MenuItem("New");
        MenuItem Open = new MenuItem("Open");
        MenuItem Close = new MenuItem("Close");
        MenuItem Cut = new MenuItem("Cut");
        MenuItem Copy = new MenuItem("Copy");
        MenuItem Paste = new MenuItem("Paste");

        Menu File = new Menu("File");
        Menu Edit = new Menu("Edit");

        File.getItems().add(New);
        File.getItems().add(Open);
        File.getItems().add(Close);

        Edit.getItems().add(Cut);
        Edit.getItems().add(Copy);
        Edit.getItems().add(Paste);

        MenuBar manu3 = new MenuBar(File, Edit, Help);

        borderPane.setTop(manu3);

        // les truc à gauche
        Button Bouton1 = new Button("Bouton1");
        Button Bouton2 = new Button("Bouton2");
        Button Bouton3 = new Button("Bouton3");

        Label label1 = new Label("Name:");
        TextField texte = new TextField();
        borderPane.getChildren().addAll(label1, texte);

        borderPane.setLeft(Bouton1);
        borderPane.setLeft(Bouton2);
        borderPane.setLeft(Bouton3);

        //Creating a GridPane container
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);
//Defining the Name text field
        final TextField name = new TextField();
        name.setPromptText("Enter your first name.");
        name.setPrefColumnCount(10);
        name.getText();
        GridPane.setConstraints(name, 0, 0);
        grid.getChildren().add(name);
//Defining the Last Name text field
        final TextField lastName = new TextField();
        lastName.setPromptText("Enter your last name.");
        GridPane.setConstraints(lastName, 0, 1);
        grid.getChildren().add(lastName);
//Defining the Comment text field
        final TextField comment = new TextField();
        comment.setPrefColumnCount(15);
        comment.setPromptText("Enter your comment.");
        GridPane.setConstraints(comment, 0, 2);
        grid.getChildren().add(comment);
//Defining the Submit button
        Button submit = new Button("Submit");
        GridPane.setConstraints(submit, 1, 0);
        grid.getChildren().add(submit);
//Defining the Clear button
        Button clear = new Button("Clear");
        GridPane.setConstraints(clear, 1, 1);
        grid.getChildren().add(clear);


        // Ajout du conteneur à la scene
        Scene scene = new Scene(borderPane);

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 500 );
        primaryStage.setHeight( 500 );
        primaryStage.setTitle("c'est l'exo 1");

        // Affichage de la fenêtre
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
