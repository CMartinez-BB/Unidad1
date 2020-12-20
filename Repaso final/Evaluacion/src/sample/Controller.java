package sample;

import Proyecto_Libreria.Pez;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
@FXML
    TextField txt1;
@FXML
    ListView lista1;
@FXML
    ComboBox combo;

@FXML protected void initialize(){
    combo.getItems().removeAll(combo.getItems());
    combo.getItems().addAll("Trucha","Bacalao");

}

Pez pescao=new Pez();
String[] peces=new String[3];

public void insertar(ActionEvent event){

    if (txt1.getText().equals("")){
        Alert alerta=new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("QUE PASO CRACK");
        alerta.setHeaderText("Alert!!!!");
        alerta.setContentText("Rellena el campo que falta crack!");
        alerta.showAndWait();
    }else {
        double dato=Double.parseDouble(txt1.getText());
        double resto=(dato*.10);
        String Resto=String.valueOf(resto);
        String res=pescao.Por_nacimiento(dato );




        peces [0]=res;
        peces [1]=String.valueOf(combo.getValue().toString());
        peces [2]=Resto;
    }
}
public void Procesar (ActionEvent event){
    double dato = Double.parseDouble(txt1.getText());
    lista1.getItems().add("Pescado "+peces[1]+" nacen "+dato+
            " por cria y "+peces[0]+" al año lo cual nos da una perdida de: "+peces[2]);
    txt1.setText("");

    }

    public void Exit(ActionEvent event){
    System.exit(0);
    }
}

