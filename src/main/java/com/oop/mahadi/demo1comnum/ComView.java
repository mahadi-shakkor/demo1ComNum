package com.oop.mahadi.demo1comnum;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ComView {

    @FXML
    private TableColumn<DemoCl, String> imgColfxid;

    @FXML
    private TableColumn<DemoCl, String> realcomfxid;

    @FXML
    private TextField realtextfildFxid;

    @FXML
    private TableView<DemoCl> tableViewFxid;
ArrayList<_COM_NUM_OPERATION> arrco =new ArrayList<>();
    @FXML
    private TextField imgtextfilfFxid;
    @FXML
    private DatePicker datepickerFxid;
    @FXML
    private Label datelavel;

    @FXML
    void addbuttonaction(ActionEvent event) {
        System.out.println(imgtextfilfFxid.getText()+"   "+realtextfildFxid.getText());
        if ((StringValidator.isValidString(imgtextfilfFxid.getText()))&&(StringValidator.isValidString(realtextfildFxid.getText()))){


            datelavel.setText("");
            int x=Integer.parseInt(realtextfildFxid.getText());
            int y=Integer.parseInt(imgtextfilfFxid.getText());

            _COM_NUM_OPERATION c1=new _COM_NUM_OPERATION(x,y);
            arrco.add(c1);
            tableViewFxid.getItems().add(new DemoCl(realtextfildFxid.getText(),imgtextfilfFxid.getText()));
            if (DateValidator.isAfterCurrentDate(datepickerFxid.getValue().toString(),"yyyy-MM-dd")){
                datelavel.setText("after of today date");
                System.out.println(datepickerFxid.getValue().toString());

            }
            else {

                datelavel.setText("bofore of today date or equal");
            }

            System.out.println(datepickerFxid.getValue().toString());


        }
        else {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Invalid Input");
            alert.setHeaderText(null); // No header
            alert.setContentText("uour input must not contain duplicate and less than = 7 digit");

            // Show the alert
            alert.showAndWait();
        }


    }

    @FXML
    void shoebuttononaction(ActionEvent event) {
         tableViewFxid.getItems().clear();
         for (_COM_NUM_OPERATION c:arrco){

             tableViewFxid.getItems().add(new DemoCl(
                   Integer.toString( c.getReal()),
                     Integer.toString(c.getImg())));
         }

    }

    @FXML
    void initialize() {



        realcomfxid.setCellValueFactory (new PropertyValueFactory<DemoCl,String>("Rea"));


        imgColfxid.setCellValueFactory (new PropertyValueFactory<DemoCl,String>("Img"));

    }


}
