package ca.bcit.coop.hackathon;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;



public class ScheduleInput extends GridPane {
    /**
     * Records the task the user inputed.
     */
    private TextField taskEntry;
    
    /**
     * Provides the 
     */
    private DatePicker pickDate;
    
    public ScheduleInput() {
        final int horizontalGap = 50;
        final int verticalGap = 10;
        
        Text courseChoice = new Text("Choose the course: ");
        final ComboBox<String> courseAdd = new ComboBox<String>();
        courseAdd.getItems().addAll(
                "Default",
                "COMP2526",
                "COMP2121",
                "COMP2510",
                "COMP2714",
                "COMP2721",
                "COMP2216"
                );
        
        courseAdd.setValue("Default");
        
        Text task = new Text("Name the task: ");
        taskEntry = new TextField();
        
        Text dueDate = new Text("Enter the due date: ");
        pickDate = new DatePicker();
        
        Button button = new Button("Add");
        button.setOnAction(this::processButtonPress);
        
        Button submit = new Button("Submit");
        submit.setOnAction(this::processButtonPress);
        
        setAlignment(Pos.CENTER);
        setHgap(horizontalGap);
        setVgap(verticalGap);
        
        
        add(courseChoice, 0, 0);
        add(courseAdd, 0, 1);
        add(task, 0, 2);
        add(taskEntry, 0, 3);
        add(dueDate, 0, 4);
        add(pickDate, 0, 5);
        add(button, 0, 6);
        add(submit, 1, 6);
    }
    
    public void processButtonPress(ActionEvent event) {
        
    }
}
