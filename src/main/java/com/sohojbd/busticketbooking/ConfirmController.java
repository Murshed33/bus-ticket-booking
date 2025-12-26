package com.sohojbd.busticketbooking;


import javafx.fxml.FXML;

import javafx.scene.control.Label;

public class ConfirmController {
    @FXML
    private Label passengerLabel;
    @FXML
    private Label busLabel;
    @FXML
    private Label routeLabel;
    @FXML
    private Label dateLabel;
    @FXML
    private Label seatLabel;
    @FXML
    private Label priceLabel;

    public void initialize() {
        BusTicket bt = AddTicketController.selectedTicket;
        if (bt != null) {
            passengerLabel.setText("Passenger: " + bt.getPassengername());
            busLabel.setText("Bus name: " + bt.getBusname());
            routeLabel.setText("Bus Route: " + bt.getSource() + "--->" + bt.getDestination());
            dateLabel.setText("Date & Time: " + bt.getDate() + " " + bt.getTime());
            seatLabel.setText(("Seat Number: " + bt.getSeatnumber()));
            priceLabel.setText("Price: " + bt.getPrice());
        }
    }
        public void ConfirmTicket () {
            System.out.println("Ticket Confirmed!!!");
        }
    }
