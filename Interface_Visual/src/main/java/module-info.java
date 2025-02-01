module com.example.interface_visual {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.interface_visual to javafx.fxml;
    exports com.example.interface_visual;
}