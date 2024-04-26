package harry.todolistproject;

public class Assignment {

    private final String className;
    private final String classNumber;
    private final String assignmentName;
    private final Date dueDate;

    public Assignment(String className, String classNumber, String assignmentName, String dueDate) {
        this.className = className.toUpperCase();
        this.classNumber = classNumber.toUpperCase();
        this.assignmentName = assignmentName.toUpperCase();
        this.dueDate = new Date(dueDate.split("/"));
    }

    public String displayLog() {
        return this.className + "," + this.classNumber + "," + this.assignmentName + "," + this.dueDate.displayDate();
    }

}
