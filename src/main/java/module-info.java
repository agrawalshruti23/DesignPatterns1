module com.example.designpatterns1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.designpatterns1 to javafx.fxml;
    exports com.example.designpatterns1;
}