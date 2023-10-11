module com.example.roomassign {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.roomassign to javafx.fxml;
    exports com.example.roomassign;
}