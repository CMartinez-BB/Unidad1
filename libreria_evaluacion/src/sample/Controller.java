package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    @FXML TextField txtArreglo2;
    @FXML TextField txtArreglo1;
    @FXML ListView lista1;
    int [] arrgelo1=new int [150];
    int cont=0;
    public  void procesar1(ActionEvent event){


    }
    public void insertar(ActionEvent event){
        if (cont<150){
            int dato=Integer.parseInt(txtArreglo1.getText());
            int dato2=Integer.parseInt(txtArreglo2.getText());

        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR CRACK");
            alert.setContentText("Arreglo lleno");
            alert.show();
        }

    }
    public void imprimirarreglo(int[]arre){
        for(int x=0;x< arre.length;x++){
            System.out.print(arre[x]+",");
        }
        System.out.println("");

    }


}
