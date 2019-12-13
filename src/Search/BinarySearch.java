package Search;

public class BinarySearch {

    // Iterative approach
    public static int searchIterative(int value, int[] array) {
        int min = 0;
        int max = array.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }

    // Recursive approach
    public static int searchRecursive(int value, int[] array, int min, int max) {
        while (min <= max) {
            int mid = (min + max) / 2;

            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                return searchRecursive(value, array, mid + 1, max);
            } else {
                return searchRecursive(value, array, min, max - 1);
            }
        }
        return -1;
    }
}
