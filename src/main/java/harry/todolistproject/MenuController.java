package harry.todolistproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MenuController {

    @FXML
    private TextField UserClassName;
    @FXML
    private TextField UserClassNumber;
    @FXML
    private TextField UserAssignmentName;
    @FXML
    private TextField UserDueDate;

    @FXML
    public void AddAssignmentClick (ActionEvent event) throws IOException {
        String className = UserClassName.getText();
        String classNumber = UserClassNumber.getText();
        String assignmentName = UserAssignmentName.getText();
        String dueDate = UserDueDate.getText();

        AssignmentInput assignmentInput = new AssignmentInput(className, classNumber, assignmentName, dueDate);
        AssignmentLog assignment = assignmentInput.createAssignmentLog();
        System.out.println(assignment.displayLog());
    }
}