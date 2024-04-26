package harry.todolistproject;

public class Course {

    private String className;
    private String classNumber;

    public Course (String className, String classNumber) {
        this.className = className;
        this.classNumber = classNumber;
    }

    public String displayCourse () {
        return className.toUpperCase() + "," + classNumber;
    }

}
