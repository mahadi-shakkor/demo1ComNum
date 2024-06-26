package com.oop.mahadi.demo1comnum;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
    void addbuttonaction(ActionEvent event) {
         int x=Integer.parseInt(realtextfildFxid.getText());
int y=Integer.parseInt(imgtextfilfFxid.getText());

        _COM_NUM_OPERATION c1=new _COM_NUM_OPERATION(x,y);
        arrco.add(c1);
        tableViewFxid.getItems().add(new DemoCl(realtextfildFxid.getText(),imgtextfilfFxid.getText()));
        LocalDate xx= LocalDate.now();



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
