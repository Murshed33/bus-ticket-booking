package com.sohojbd.busticketbooking.busticketmanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.Random;

public class AddTicketController {

    @FXML
    private TextField nameField;

    @FXML
    private ComboBox<String> busChoice;

    @FXML
    private ComboBox<String> sourceChoice;

    @FXML
    private ComboBox<String> destinationChoice;

    @FXML
    private TextField dateField;

    @FXML
    private TextField timeField;

    private Random random = new Random();

    @FXML
    public void initialize() {
        busChoice.getItems().addAll("Green Line", "Hanif", "Shohag");

        sourceChoice.getItems().addAll("Dhaka", "Chittagong", "Sylhet");
        destinationChoice.getItems().addAll("Dhaka", "Chittagong", "Sylhet");
    }

    @FXML
    private void handleConfirm() throws Exception {

        // Generate random seat number (A1 to D4)
        String[] rows = {"A", "B", "C", "D"};
        int seatNum = random.nextInt(4) + 1; // 1 to 4
        String seat = rows[random.nextInt(rows.length)] + seatNum;

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/com/sohojbd/busticketbooking/busticketmanagement/confirm_ticket.fxml")
        );

        Scene scene = new Scene(loader.load(), 400, 400);

        ConfirmTicketController controller = loader.getController();
        controller.setTicketData(
                nameField.getText(),
                busChoice.getValue(),
                sourceChoice.getValue(),
                destinationChoice.getValue(),
                dateField.getText(),
                timeField.getText(),
                seat,
                800
        );

        Stage stage = (Stage) nameField.getScene().getWindow();
        stage.setScene(scene);
    }
}
