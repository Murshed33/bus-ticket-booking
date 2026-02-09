package com.sohojbd.busticketbooking.busticketmanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ConfirmTicketController {

    @FXML
    private Label nameLabel;

    @FXML
    private Label busLabel;

    @FXML
    private Label routeLabel;

    @FXML
    private Label dateTimeLabel;

    @FXML
    private Label seatLabel;

    @FXML
    private Label priceLabel;

    public void setTicketData(String name, String bus, String source, String destination,
                              String date, String time, String seat, int price) {

        nameLabel.setText("Passenger Name: " + name);
        busLabel.setText("Bus Name: " + bus);
        routeLabel.setText("Route: " + source + " → " + destination);
        dateTimeLabel.setText("Date & Time: " + date + ", " + time);
        seatLabel.setText("Seat Number: " + seat);
        priceLabel.setText("Price: " + price + " BDT");
    }

    @FXML
    private void handlepayment() throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/com/sohojbd/busticketbooking/busticketmanagement/payment.fxml")
        );

        Scene scene = new Scene(loader.load(), 400, 450);
        Stage stage = (Stage) nameLabel.getScene().getWindow();
        stage.setScene(scene);
    }
}
