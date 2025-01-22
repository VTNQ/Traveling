module com.mg.traveling_booking_application {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mg.traveling_booking_application to javafx.fxml;
    exports com.mg.traveling_booking_application;
}