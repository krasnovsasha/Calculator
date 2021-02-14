package HomeWork4.ReplaceArray;

/**
 * @author Alexander Krasnov
 * @see #createArray() which create a new array with length 20 and random elements (numbers -10 up to +10 )
 * @see #replaceMinMax(int[]) which swaps the max negative array element and the min positive
 */
public class ReplaceArray {
    public ReplaceArray(){
        replaceMinMax(createArray());
    }

    private static int[] createArray() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 22 - 11);
        }
        return array;
    }

    private static int[] replaceMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 & arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
            if (arr[i] > 0 & arr[i] < max) {
                max = arr[i];
                indexMax = i;
            }
            arr[indexMin] = max;
            arr[indexMax] = min;
        }
        return arr;
    }

}
