package com.sohojbd.busticketbooking;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
        public void start(Stage stage) throws Exception{
            SceneController.switchScene("Confirm.fxml");
            FXMLLoader loader= new FXMLLoader(Main.class.getResource("Register.fxml"));
            Scene scene= new Scene(loader.load(),600,500);
            stage.setTitle("---Bus Ticket Booking---");
            stage.setScene(scene);
            stage.show();

            // Alif testing github
        }
    public static void main(String[] args) {
        launch();
    }
}
