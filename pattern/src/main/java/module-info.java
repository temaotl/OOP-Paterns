module org.example.pattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.pattern to javafx.fxml;
    exports org.example.pattern;
}