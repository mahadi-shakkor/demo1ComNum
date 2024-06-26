module com.oop.mahadi.demo1comnum {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.mahadi.demo1comnum to javafx.fxml;
    exports com.oop.mahadi.demo1comnum;
}