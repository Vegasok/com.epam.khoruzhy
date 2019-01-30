package action;

public class ArraySorting {
    public static double[] sort(double [] array){
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength - 1; i++){
            for (int j = 0; j < arrayLength - 1 - i; j ++){
                if (array[j + 1] < array[j]){
                    double temp = array[j + 1];
                    array[j + 1] = array [j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
