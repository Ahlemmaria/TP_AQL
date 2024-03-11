package org.example;

public class BinarySearch_mod {
    public static int binarySearch(int[] array, int element) {
        if (array == null) {
            throw new NullPointerException("Array must not be null");
        }
        int low = 0;
        int high = array.length - 1;
        while (low <= high) { // Modification ici : low <= high au lieu de low < high
            int mid = (low + high) / 2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] < element) { // Modification ici : utilisation de < au lieu de <=
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}