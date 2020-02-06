module ComponenteReloj {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.base;

    exports com.alberto.componente;
    opens com.alberto.componente to javafx.fxml;
}