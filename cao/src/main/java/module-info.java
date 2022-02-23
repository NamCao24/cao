module com.mycompany.cao {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.cao to javafx.fxml;
    exports com.mycompany.cao;
}
