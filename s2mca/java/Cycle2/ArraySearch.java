public class ArraySearch {
    public static void main(String[] args) {
        int[] array = { 1, 4, 6, 7, 9, 10 };
        int element = 7;
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + element + " found in the array.");
        } else {
            System.out.println("Element " + element + " not found in the array.");
        }
    }
}
