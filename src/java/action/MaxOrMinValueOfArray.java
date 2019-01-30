package action;

public class MaxOrMinValueOfArray {
    public static double getMinValueOfArray(double[] array){
        int arrayLength = array.length;
        double minValueOfArray = array[0];

        for (int i = 1; i < arrayLength; i++){
            if (array[i] < array[0]){
                minValueOfArray = array[i];
            }
        }
        return minValueOfArray;
    }

    public static double getMaxValueOfArray(double[] array){
        int arrayLength = array.length;
        double maxValueOfArray = array[0];

        for (int i = 1; i < arrayLength; i++){
            maxValueOfArray = Math.max(maxValueOfArray, array[i]);
        }
        return maxValueOfArray;
    }
}
