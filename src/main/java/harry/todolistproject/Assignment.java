package harry.todolistproject;

public class Assignment {

    private final Course course;
    private final String assignmentName;
    private final Date dueDate;

    public Assignment(String className, String classNumber, String assignmentName, String dueDate) {
        this.course = new Course(className.toUpperCase(), classNumber);
        this.assignmentName = assignmentName.toUpperCase();
        this.dueDate = new Date(dueDate.split("/"));
    }

    public String displayLog() {
        return this.course.displayCourse() + "," + this.assignmentName + "," + this.dueDate.displayDate();
    }

}
