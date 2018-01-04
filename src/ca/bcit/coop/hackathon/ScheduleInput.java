package ca.bcit.coop.hackathon;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import javafx.collections.FXCollections;
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
        ComboBox<CourseName> courseAdd = new ComboBox<CourseName>();
        courseAdd.getItems().setAll(CourseName.values());
        /**
        courseAdd.getItems().addAll(
                CourseName.COMP2526,
                CourseName.COMP2121,
                CourseName.COMP2510,
                CourseName.COMP2714,
                CourseName.COMP2721,
                CourseName.COMM2216
                );
        */
      
        
        Text task = new Text("Name the task: ");
        taskEntry = new TextField();
        
        Text dueDate = new Text("Enter the due date: ");
        pickDate = new DatePicker();
        
        Button button = new Button("Add");
        button.setOnAction(this::processAddPress);
        
        Button submit = new Button("Submit");
        submit.setOnAction(arg0 -> {
            try {
                processSubmitPress(arg0);
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
        
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
    
    public void processAddPress(ActionEvent event) {
        taskEntry.getText();
        
        new Task(taskEntry.getText(), new Date(4, 20), courseAdd.getValue());
        System.out.println(courseValue);
        

    }
    
    public void processSubmitPress(ActionEvent event) throws FileNotFoundException {
        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        System.setOut(out);
        for(int i = 0; i < 104; i++) {
            for(Task temp : Task.getArray().get(i)) {
                int currentTempIndex = Task.getArray().get(i).indexOf(temp);
                int prevTempIndex = currentTempIndex - 1;
                if(currentTempIndex == 0) {
                    System.out.println(temp.getDueDate().toString() + "\n");
                }
                if (currentTempIndex > 0) {
                    if(temp.getCourse().equals(Task.getArray().get(i).get(prevTempIndex).getCourse())) {
                        System.out.println("\t\t" + temp.getTaskName());
                    }
                } else 
                System.out.println(temp.toString());
            }
            
        }
        
    }
}
