package ca.bcit.coop.hackathon;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ComboBox {

    public ComboBox(ObservableList<String> options) {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        ObservableList<String> options = 
                FXCollections.observableArrayList(
                    "Option 1",
                    "Option 2",
                    "Option 3"
                );
            final ComboBox comboBox = new ComboBox(options);
            
            
    }

}
