package com.ejercicio1_css.ejercicio1_css;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Ejercicio1Controller {
    @FXML
    private Button estilo1;
    @FXML
    private Button estilo2;
    @FXML
    private Button estilo3;
    @FXML
    private Button estilo4;
    @FXML
    private Button estilo1_clase;
    @FXML
    private Button estilo2_clase;
    @FXML
    private Button estilo3_clase;
    @FXML
    private Button estilo4_clase;
    @FXML
    private Button limpiarEstilo;
    @FXML
    private Button asignarEstilo;


    @FXML
    protected void onEstilo1Click() {
        this.estilo1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
    }

    @FXML
    protected void onEstilo2Click() {
        this.estilo2.setStyle("-fx-background-color: #ffd700; -fx-text-fill: white;");
    }

    @FXML
    protected void onEstilo3Click() {
        this.estilo3.setStyle("-fx-background-color: #008b8b; -fx-text-fill: white;");
    }

    @FXML
    protected void onEstilo4Click() {
        this.estilo4.setStyle("-fx-background-color: #006400; -fx-text-fill: white;");
    }

    @FXML
    protected void onEstilo1_ClaseClick() {

        //Aquí agregamos la clase CSS a el boton
        estilo1_clase.getStyleClass().add("mi_clase_estilo1");


    }
    @FXML
    protected void onEstilo2_ClaseClick() {

        //Aquí agregamos la clase CSS a el boton
        estilo2_clase.getStyleClass().add("mi_clase_estilo2");

    }
    @FXML
    protected void onEstilo3_ClaseClick() {

        //Aquí agregamos la clase CSS a el boton
        estilo3_clase.getStyleClass().add("mi_clase_estilo3");

    }
    @FXML
    protected void onEstilo4_ClaseClick() {

        //Aquí agregamos la clase CSS a el boton


    }

    @FXML
    protected void onLimpiarEstilo_ClaseClick() {

        //Aquí agregamos la clase CSS a el boton
        limpiarEstilo.getScene().getStylesheets().clear();


    }

}
