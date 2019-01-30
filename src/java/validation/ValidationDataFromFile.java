package validation;
import file.FileWorker;
import java.io.IOException;

public class ValidationDataFromFile {
    public static String[][] getStringArrayFromFile(String fileName) throws IOException {
        String textFromFile = FileWorker.read(fileName);
        String[] rows = textFromFile.split("\n");
        String[][] matrix = new String[rows.length][];
        int i = 0;

        for (String row : rows){
            if (row.matches("([0-9]^*\\s*)+")){
                matrix[i++] = row.split(" ");
            }
        }

        return DelEmptyRowTwoDArray.deleteNullFromArray(matrix);
    }
}
