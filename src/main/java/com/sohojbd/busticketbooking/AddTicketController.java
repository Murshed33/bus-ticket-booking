package com.sohojbd.busticketbooking;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddTicketController{
    @FXML private TextField passengernameField;
    @FXML private TextField numberField;
    @FXML private TextField busField;
    @FXML private TextField dateField;
    @FXML private TextField timeField;
    @FXML private TextField seatField;
    @FXML private TextField priceField;
    public void save() throws Exception{
        String passengername= passengernameField.getText();
        int passengerNumber= numberField.getLength();
        String busname= busField.getText();
        String date= dateField.getText();
        String time= timeField.getText();
        String seatnumber= seatField.getText();
        double ticketprice= Double.parseDouble(priceField.getText());
        BusTicket bt= new BusTicket(passengername,passengerNumber,busname,date,time,seatnumber,ticketprice);

        }


    }
