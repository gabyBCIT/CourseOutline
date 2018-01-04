package ca.bcit.coop.hackathon;

import java.util.Collections;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
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
    
    private ComboBox<String> courseAdd;
    
    private int taskCounter = 0;
    
    private Text complete;
    
    
    public ScheduleInput() {
        final int horizontalGap = 50;
        final int verticalGap = 10;
        
        Text courseChoice = new Text("Choose the course: ");
        courseAdd = new ComboBox<String>();
        courseAdd.getItems().addAll(
                "\t\t",
                "COMP2526",
                "COMP2121",
                "COMP2510",
                "COMP2714",
                "COMP2721",
                "COMP2216"
                );
        
        courseAdd.setValue("\t\t");
        
        Text task = new Text("Name the task: ");
        taskEntry = new TextField();
        
        Text dueDate = new Text("Enter the due date: ");
        pickDate = new DatePicker();
        
        Button button = new Button("Add");
        button.setOnAction(this::processButtonPress);
        
        Button submit = new Button("Submit");
        submit.setOnAction(this::processDatePicker);
        
        complete = new Text("");
        
        
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
        add(complete, 0, 7);
        add(submit, 1, 6);
    }
    
    public void processButtonPress(ActionEvent event) {
        
        taskCounter++;
        complete.setText("Task " + taskCounter + " added!");
        complete.setFill(Color.GREEN);

        
        // Reads the date as a string and converts it to a Date for the Task.
        String date = pickDate.getEditor().getText();        
        Scanner s = new Scanner(date).useDelimiter("/");
        
        int day = s.nextInt();
        int month = s.nextInt();
        Date dueDate = new Date(month, day);
        
        String task = taskEntry.getText();
        
        String output = courseAdd.getSelectionModel().getSelectedItem().toString();
        
        Task2 addTask = new Task2(task, dueDate, output);
        
        taskEntry.clear();
        //pickDate.setValue(null);
        courseAdd.valueProperty().setValue("Default");
        
    }
    
    public void processDatePicker(ActionEvent event) {
        
        getChildren().clear();
        
        
        Collections.sort(Task2.array);
        int count = 0;
        for (int i = 0; i < Task2.array.size(); i++) {
            if (!Task2.array.get(i).equals(null)) {
            Text text = new Text(Task2.array.get(i).toString());
            add(text, 0, count + 1);
            count++;
            }
        }
       
        
        

        Text dueDate = new Text("Your tasks");
        
        Font font = new Font(25);
        dueDate.setFont(font);
        
        
        
        Button submit = new Button("Return");
        submit.setOnAction(this::processReturn);
        
        
        
        add(dueDate, 0, 0);
        add(submit, 0, count + 1);
        
    }
    
    
    public void processReturn(ActionEvent event) {
        getChildren().clear();
        final int horizontalGap = 50;
        final int verticalGap = 10;
        
        Text courseChoice = new Text("Choose the course: ");
        courseAdd = new ComboBox<String>();
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
        submit.setOnAction(this::processDatePicker);
        
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
}
