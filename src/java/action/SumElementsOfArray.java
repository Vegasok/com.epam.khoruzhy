package action;

public class SumElementsOfArray {
    public static double getSumElementsOfArray(double[] array){
        int arrayLength = array.length;
        double sumValueOfArray = 0;

        for (int i = 0; i < arrayLength; i++){
            sumValueOfArray += array[i];
        }

        return sumValueOfArray;
    }
}
