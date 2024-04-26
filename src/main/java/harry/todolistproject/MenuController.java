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
    private Label errorLabel;

    @FXML
    public void AddAssignmentClick (ActionEvent event) throws IOException {
        String className = UserClassName.getText();
        String classNumber = UserClassNumber.getText();
        String assignmentName = UserAssignmentName.getText();
        String dueDate = UserDueDate.getText();

        Assignment assignment = addAssignment(className, classNumber, assignmentName, dueDate);

        WriteFile.log(assignment);
    }

    public Assignment addAssignment (String className, String classNumber, String assignmentName, String dueDate) {
        AssignmentInput assignmentInput = new AssignmentInput(className, classNumber, assignmentName, dueDate);

        if (!assignmentInput.isValidClassName()) {
            errorLabel.setText("Class name must have 4 letters (e.g. \"math\")");
        } else if (!assignmentInput.isValidDueDate()) {
            errorLabel.setText("Date must be in yy/mm/dd format. (e.g. for March 11th 2016: \"16/03/11\")");
        } else {
            return assignmentInput.createAssignmentLog();
        }

        return null;
    }
}