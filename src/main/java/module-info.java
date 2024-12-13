module com.example.moriczpeter_asztali_gui_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.moriczpeter_asztali_gui_calculator to javafx.fxml;
    exports com.example.moriczpeter_asztali_gui_calculator;
}