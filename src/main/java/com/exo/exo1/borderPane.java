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
        hb.getChildren().addAll(label1, texte);
        hb.setSpacing(10);

        borderPane.setLeft(Bouton1, Bouton2, Bouton3);

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
