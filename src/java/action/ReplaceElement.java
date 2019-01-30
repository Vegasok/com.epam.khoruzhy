package action;

public class ReplaceElement {
    public static double[] replaceElement(double newElement, int position, double[] array){
        int lengthOfArray = array.length;

        if (position >= lengthOfArray || position < 0){
            return array;
        }
        int i = 0;
        while(i != position) i++;
        array[i] = newElement;

        return array;
    }
}
