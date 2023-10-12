module com.example.roomassign {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.example.roomassign.logic;
    opens com.example.roomassign.logic to javafx.fxml;
}