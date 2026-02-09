package com.sohojbd.busticketbooking.busticketmanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    // Sample users
    private String[] username = {"Murshed","Neesa","Suraiya"};
    private String[] password = {"482","508","516"};

    @FXML
    public void handleLogin() {

        String inputUser = usernameField.getText();
        String inputPass = passwordField.getText();

        boolean loginSuccess = false;

        for (int i = 0; i < username.length; i++) {
            if (inputUser.equals(username[i]) &&
                    inputPass.equals(password[i])) {
                loginSuccess = true;
                break;
            }
        }

        if (loginSuccess) {
            switchToAddTicket();
        } else {
            messageLabel.setText("Invalid Username or Password");
        }
    }

    private void switchToAddTicket() {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/sohojbd/busticketbooking/busticketmanagement/add_ticket.fxml"));

            Scene scene = new Scene(loader.load());

            Stage stage = (Stage) usernameField.getScene().getWindow();
            stage.setTitle("Add Ticket");
            stage.setScene(scene);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}