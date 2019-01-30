package validation;

public class DelEmptyRowTwoDArray {
    protected static String[][] deleteNullFromArray(String[][] oldArray) {
        if (oldArray == null) {
            return oldArray;
        }

        int newSize = 0;
        int index = 0;

        for (String[] arrayLine : oldArray) {
            if (arrayLine != null) {
                newSize++;
            }
        }

        String[][] bufferArray = new String[newSize][];

        for (String[] arrayLine : oldArray) {
            if (arrayLine != null) {
                bufferArray[index++] = arrayLine;
            }
        }

        return bufferArray;
    }
}
