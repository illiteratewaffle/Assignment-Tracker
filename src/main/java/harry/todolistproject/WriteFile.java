package harry.todolistproject;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public abstract class WriteFile {

    public static void log (Assignment assignment) throws IOException {
        File file = new File("src/LoggedAssignments/assignmentList.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(assignment.displayLog());

        bufferedWriter.flush();
    }

}
