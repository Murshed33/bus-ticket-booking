module com.sohojbd.busticketbooking {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sohojbd.busticketbooking.busticketmanagement to javafx.fxml;
    exports com.sohojbd.busticketbooking.busticketmanagement;
}