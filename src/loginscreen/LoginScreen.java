/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 *
 * @author Oscar Neiva
 */
public class LoginScreen extends Application{
    
    // Start game controller and launch the stage.
    public static void main(String[] args) {
        
        // Instance created as a thread with method start

        
        // Launch front-end application
        launch(args);
    }
    
    @Override
    // Create a primary stage with an empty scene.
    public void start(Stage window) throws Exception {
        window.setTitle("Login Screen");
        StackPane layout = new StackPane();
        
        // Create pane
        StackPane pane = new StackPane();
        
        // Create text fields
        Label emailLabel = new Label("E-mail: ");
        TextField emailField = new TextField();
        Label pswLabel = new Label("Password: ");
        TextField pswField = new TextField();
        
        // Create button
        Button btnSend = new Button();
        btnSend.setText("Sing in");
        btnSend.setOnAction(e -> {
            System.out.println("Button has been fired");
        });
        
        // Create boxes
        HBox emailBox = new HBox();
        emailBox.setAlignment(Pos.CENTER);
        emailBox.setPadding(new Insets(0,0,100,0));
        
        HBox pswBox = new HBox();
        pswBox.setAlignment(Pos.CENTER);
        pswBox.setPadding(new Insets(100,0,100,0));
        
        HBox btnBox = new HBox();
        btnBox.setAlignment(Pos.CENTER);
        btnBox.setPadding(new Insets(150,0,50,0));
        
        emailBox.getChildren().addAll(emailLabel, emailField);
        pswBox.getChildren().addAll(pswLabel, pswField);
        btnBox.getChildren().add(btnSend);
        
        // Set pane
        pane.getChildren().addAll(emailBox, pswBox, btnBox);
        
        Scene scene = new Scene(pane, 400, 200);
        window.setScene(scene);
        window.show();
    }
 
}