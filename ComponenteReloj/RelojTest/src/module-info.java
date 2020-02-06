module RelojTest {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.base;
    requires ComponenteReloj;

    exports com.alberto.test;
    opens com.alberto.test to javafx.fxml;
}