package com.sohojbd.busticketbooking.busticketmanagement;

/** Suraiya Tabassum **/

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class PaymentController {

    @FXML
    private Label amountLabel;

    @FXML
    private ChoiceBox<String> paymentChoice;

    @FXML
    private PasswordField pinField;

    private final int AMOUNT = 800;
    private final String CORRECT_PIN = "0516";

    @FXML
    public void initialize() {
        paymentChoice.getItems().addAll("bKash", "Nagad", "Rocket");
        amountLabel.setText("Amount to Pay: " + AMOUNT + " BDT");
    }

    @FXML
    private void handleConfirmPayment() throws Exception {

        if (paymentChoice.getValue() == null || pinField.getText().isEmpty()) {
            showAlert("Error", "Please select payment method and enter PIN.");
            return;
        }

        if (pinField.getText().equals(CORRECT_PIN)) {

            showAlert("Payment Successful",
                    "Payment of " + AMOUNT + " BDT completed using " + paymentChoice.getValue());

            // Go back to Add Ticket
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/sohojbd/busticketbooking/busticketmanagement/add_ticket.fxml")
            );

            Scene scene = new Scene(loader.load(), 400, 450);
            Stage stage = (Stage) amountLabel.getScene().getWindow();
            stage.setScene(scene);

        } else {
            showAlert("Payment Failed", "Wrong PIN number!");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}