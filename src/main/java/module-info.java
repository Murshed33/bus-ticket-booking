module com.sohojbd.busticketbooking {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sohojbd.busticketbooking to javafx.fxml;
    exports com.sohojbd.busticketbooking;
}