module com.example.trabajo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.trabajo1 to javafx.fxml;
    exports com.example.trabajo1;
}