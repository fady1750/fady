module com.example.stockmarketmanger {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stockmarketmanger to javafx.fxml;
    exports com.example.stockmarketmanger;
}