import action.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import validation.ValidationDataFromFile;
import java.io.IOException;
import java.util.Arrays;

public class Performing {
    private static final String FILENAME = "data/file.txt";
    static final Logger rootLogger = LogManager.getRootLogger();

    public static void main(String[] args) throws IOException {

        double[][] arraysFromFiles = ConvertingToDoubleArray.getDoubleArray(ValidationDataFromFile.getStringArrayFromFile(FILENAME));

        System.out.println("Get data:");
        for (double[] arraysFromFile : arraysFromFiles) {
            System.out.println(Arrays.toString(arraysFromFile));
        }

        System.out.println("\nAfter sorting:");
        for (double[] arraysFromFile : arraysFromFiles) {
            System.out.println(Arrays.toString(ArraySorting.sort(arraysFromFile)));
        }

        System.out.println("\nSum elements of array(s):");
        for (double[] arraysFromFile : arraysFromFiles) {
            System.out.println(SumElementsOfArray.getSumElementsOfArray(arraysFromFile));
        }

        System.out.println("\nAverage values:");
        for (double[] arraysFromFile : arraysFromFiles) {
            System.out.println(AverageArray.getAverageElementsOfArray(arraysFromFile));
        }

        System.out.println("\nMin values:");
        for (double[] arraysFromFile : arraysFromFiles) {
            System.out.println(MaxOrMinValueOfArray.getMinValueOfArray(arraysFromFile));
        }

        System.out.println("\nMax values:");
        for (double[] arraysFromFile : arraysFromFiles) {
            System.out.println(MaxOrMinValueOfArray.getMaxValueOfArray(arraysFromFile));
        }

        System.out.println("\nReplace value:");
        System.out.println(Arrays.toString(ReplaceElement.replaceElement(7777.0, 1,arraysFromFiles[0])));

        rootLogger.info("Data received successfully: "  + Arrays.deepToString(ConvertingToDoubleArray.getDoubleArray(ValidationDataFromFile.getStringArrayFromFile(FILENAME))));

        if (rootLogger.isDebugEnabled()) {
            rootLogger.debug("Debugging was successful!");
        }

        try {
            Arrays.deepToString(ConvertingToDoubleArray.getDoubleArray(ValidationDataFromFile.getStringArrayFromFile(FILENAME)));
        } catch (NullPointerException ex) {
            rootLogger.error("error message: " + ex.getMessage());
            rootLogger.fatal("fatal error message: " + ex.getMessage());
        }
    }
}
