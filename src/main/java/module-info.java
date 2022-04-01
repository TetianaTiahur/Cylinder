module com.example.cylinder0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cylinder0 to javafx.fxml;
    exports com.example.cylinder0;
}