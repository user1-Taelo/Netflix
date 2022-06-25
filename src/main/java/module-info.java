module com.example.groupmovie {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.web;


    opens com.example.groupmovie to javafx.fxml;
    exports com.example.groupmovie;
}