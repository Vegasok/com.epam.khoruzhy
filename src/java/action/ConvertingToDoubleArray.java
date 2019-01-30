package action;

public class ConvertingToDoubleArray {
    public static double[][] getDoubleArray(String[][] stringArray){

        double[][] doubleArray = new double[stringArray.length][];

        for (int i = 0; i < stringArray.length; i++){
            doubleArray[i] = new double[stringArray[i].length];

            for (int j = 0; j < stringArray[i].length; j++){
                doubleArray[i][j] = Double.parseDouble(stringArray[i][j]);
            }
        }
        return doubleArray;
    }
}
