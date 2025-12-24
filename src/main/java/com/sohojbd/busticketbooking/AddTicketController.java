package com.sohojbd.busticketbooking;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
public class AddTicketController{
    public static BusTicket selectedTicket;
    @FXML private TextField passengerField;
    @FXML private ChoiceBox<String> busChoice;
    @FXML private ChoiceBox<String> sourceChoice;
    @FXML private ChoiceBox<String> destinationChoice;

    //Initialize Bus Information
    public void initialize() {
        busChoice.getItems().addAll("1.Green line","2.Shohag","3.Hanif");
        sourceChoice.getItems().addAll("Dhaka","Chittagong","Sylhet","Rajshahi");
        destinationChoice.getItems().addAll("Dhaka","Chittagong","Sylhet","Rajshahi");
    }
    public void AddTicket() {
        try {
            String passengername = passengerField.getText();
            String busname = busChoice.getValue();
            String source = sourceChoice.getValue();
            String destination = destinationChoice.getValue();

            if (busname.startsWith("Green line")) {
                selectedTicket = new BusTicket(passengername, source, destination, "Green line", "10-10-2025", "10:00 AM", "A1", 800);
            } else if (busname.startsWith("2")) {
                selectedTicket = new BusTicket(passengername, source, destination, "Shohag", "10-10-2025", "12:0 PM", "B2", 700);
            } else if (busname.startsWith("3")) {
                selectedTicket = new BusTicket(passengername, source, destination, "Hanif", "10-10-2025", "02:00 PM", "C3", 650);
            }
        } catch (Exception e) {
            System.out.println("Try Again");
            e.printStackTrace(); //help for debugging
        }
    }
    }
