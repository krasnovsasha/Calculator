package HomeWork4.ReplaceArray;

/**
 * @author Alexander Krasnov
 * @see #createArray() which create a new array with length 20 and random elements (numbers -10 up to +10 )
 * @see #replaceMinMax(int[]) which swaps the max negative array element and the min positive
 */
public class ReplaceArray {
    public ReplaceArray() {
        replaceMinMax(createArray());
    }

    private static int[] createArray() {
        System.out.println("Created random array:");
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 22 - 11);
            System.out.printf("%3d ", array[i]);
        }
        return array;
    }

    private static int[] replaceMinMax(int[] arr) {
        int min = 11;
        int max = 11;
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 & arr[i] < max) {
                max = arr[i];
                indexMax = i;
            }
            if (arr[i] > 0 & arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
        }
        arr[indexMin] = max;
        arr[indexMax] = min;
        System.out.println("\nMax negative number is " + max + " index " + indexMax + " \nMin positive number is " + min + " index " + indexMin);
        System.out.println("Modified array:");
        for (int j : arr) {
            System.out.printf("%3d ", j);
        }
        return arr;
    }

}
