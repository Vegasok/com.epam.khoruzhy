package file;

import java.io.*;

public class FileWorker {
    public static String read(String fileName) throws IOException {

        File file = new File(fileName);
        StringBuilder sb = new StringBuilder();

        try (FileReader fr = new FileReader(file.getAbsoluteFile())) {
            exists(fileName);
            BufferedReader in = new BufferedReader(fr);
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return sb.toString();
    }

    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }
}
