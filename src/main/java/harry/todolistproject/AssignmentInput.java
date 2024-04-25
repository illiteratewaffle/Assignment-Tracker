package harry.todolistproject;

import java.util.Scanner;

public class AssignmentInput {

    private String className;
    private String classNumber;
    private String assignmentName;
    private String dueDate;


    public AssignmentInput (String userClassName, String userClassNumber, String userAssignmentName, String userDueDate) {

        if (validName(userClassName)) {
            this.className = userClassName;
        } else {
            System.out.println("fuck you");
        }

        this.classNumber = userClassNumber;

        this.assignmentName = userAssignmentName;

        if (validDate(userDueDate)) {
            this.dueDate = userDueDate;
        } else {
            System.out.println("fuck you");
        }

    }

    private boolean validName (String userClassName) {

        // Checks if the class name has numbers
        for (char c : userClassName.toCharArray()) {
            if (Character.isDigit(c)) {
                return false;
            }
        }

        // Checks if class name has 4 letters
        return userClassName.length() == 4;
    }

    private boolean validDate(String userDueDate) {

        int i;
        char check = 'b';
        boolean validFormat;
        boolean validDate;
        String inputDate = userDueDate;

        validFormat = true;
        validDate = false;

        for(i = 0; i < inputDate.length(); i++){
            check = inputDate.charAt(i);
            if ((!Character.isDigit(check)) && !((i == 2) || (i == 5))) {
                System.err.println("Invalid input. Input must be in the form yy/mm/dd.");
                validFormat = false;
                break;
            } else if (inputDate.length() != 8) {
                System.err.println("Invalid input. Input must be in the form yy/mm/dd.");
                validFormat = false;
                break;
            }
        }

        //Validates year, month and day
        if (validFormat) {
            String inputYear = String.valueOf(inputDate.charAt(0)) + String.valueOf(inputDate.charAt(1));
            int valueYear = Integer.valueOf(inputYear);

            String inputMonth = String.valueOf(inputDate.charAt(3)) + String.valueOf(inputDate.charAt(4));
            int valueMonth = Integer.valueOf(inputMonth);

            String inputDay = String.valueOf(inputDate.charAt(6)) + String.valueOf(inputDate.charAt(7));
            int valueDay = Integer.valueOf(inputDay);

            if ((valueYear < 0) || (valueMonth > 12) || (valueMonth <= 0) || (valueDay <= 0) || (valueDay > 31)) {
                System.err.println("Invalid date! Please enter a valid date");
            } else {
                validDate = true;
            }
        }

        return (validFormat && validDate);
    }

    public AssignmentLog createAssignmentLog () {
        return new AssignmentLog(this.className, this.classNumber, this.assignmentName, this.dueDate);
    }

}
