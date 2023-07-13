module com.hezhangqi.echofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.hezhangqi.echofx to javafx.fxml;
    exports com.hezhangqi.echofx;
}