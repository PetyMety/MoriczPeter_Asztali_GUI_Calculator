package com.example.moriczpeter_asztali_gui_calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField input1;

    @FXML
    private TextField input2;

    @FXML
    private Label resultLabel;

    private HelloApplication aplication;

    public void setApplication(HelloApplication aplication) {
        this.aplication = aplication;
    }

    private void showAlert(String message){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Figyelmeztetés!");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private boolean validateInputs() {
        if (input1.getText().isEmpty() || input2.getText().isEmpty()) {
            showAlert("Minden mező kitöltése kötelező!");
            return false;
        }
        try {
            Double.parseDouble(input1.getText());
            Double.parseDouble(input2.getText());
        } catch (NumberFormatException e){
            showAlert("Kérjük csak számot adjon meg!");
            return false;
        }
        return true;
    }

    @FXML
    public void handleAddition(){
        if (validateInputs()){
            double result = Double.parseDouble(input1.getText()) + Double.parseDouble(input2.getText());
            resultLabel.setText(String.valueOf(result));
        }
    }

    @FXML
    public void handleSubtraction(){
        if (validateInputs()){
            double result = Double.parseDouble(input1.getText()) - Double.parseDouble(input2.getText());
            resultLabel.setText(String.valueOf(result));
        }
    }

    @FXML
    public void handleMultiplication(){
        if (validateInputs()){
            double result = Double.parseDouble(input1.getText()) * Double.parseDouble(input2.getText());
            resultLabel.setText(String.valueOf(result));
        }
    }

    @FXML
    public void handleDivision(){
        if (validateInputs()){
            if (Double.parseDouble(input2.getText()) == 0){
                showAlert("A nullával való osztás nem megengedett!");
            } else {
                double result = Double.parseDouble(input1.getText()) / Double.parseDouble(input2.getText());
                resultLabel.setText(String.valueOf(result));
            }
        }
    }

    @FXML
    public void handleModulo(){
        if (validateInputs()){
            double result = Double.parseDouble(input1.getText()) % Double.parseDouble(input2.getText());
            resultLabel.setText(String.valueOf(result));
        }
    }
}