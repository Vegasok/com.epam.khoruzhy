package action;

public class AverageArray {
    public static double getAverageElementsOfArray(double[] array){
        int arrayLength = array.length;
        return SumElementsOfArray.getSumElementsOfArray(array) / arrayLength;
    }
}
