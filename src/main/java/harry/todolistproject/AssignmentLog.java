package harry.todolistproject;

public class AssignmentLog {

    private final String className;
    private final String classNumber;
    private final String assignmentName;
    private final String dueDate;

    public AssignmentLog(String className, String classNumber, String assignmentName, String dueDate) {
        this.className = className.toUpperCase();
        this.classNumber = classNumber.toUpperCase();
        this.assignmentName = assignmentName.toUpperCase();
        this.dueDate = dueDate.toUpperCase();
    }

    public String displayLog() {
        return this.className + "," + this.classNumber + "," + this.assignmentName + "," + this.dueDate;
    }

}
