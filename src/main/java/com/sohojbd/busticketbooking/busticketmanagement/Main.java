package com.sohojbd.busticketbooking.busticketmanagement;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "/com/sohojbd/busticketbooking/busticketmanagement/login.fxml"
                )
        );

        Scene scene = new Scene(loader.load(), 500, 500);
        stage.setTitle("Bus Ticket Management");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
