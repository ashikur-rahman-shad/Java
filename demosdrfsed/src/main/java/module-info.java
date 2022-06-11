module com.example.demosdrfsed {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demosdrfsed to javafx.fxml;
    exports com.example.demosdrfsed;
}