module com.example.kotlinbasico {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.kotlinbasico to javafx.fxml;
    exports com.example.kotlinbasico;
}