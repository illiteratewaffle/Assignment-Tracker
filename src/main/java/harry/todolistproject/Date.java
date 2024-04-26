package harry.todolistproject;

public class Date {
    private final int year;
    private final int month;
    private final int day;

    public Date (String[] date) {
        this.year = Integer.parseInt(date[0]);
        this.month = Integer.parseInt(date[1]);
        this.day = Integer.parseInt(date[2]);
    }

    public String displayDate() {
        return this.year + "/" + this.month + "/" + this.day;
    }

}
