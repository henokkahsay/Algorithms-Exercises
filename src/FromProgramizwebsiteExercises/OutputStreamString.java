package FromProgramizwebsiteExercises;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class OutputStreamString {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        String line ="Hello there!";
        stream.write(line.getBytes());
        String finalString =new String(stream.toByteArray());
        System.out.println(finalString);
    }
}
