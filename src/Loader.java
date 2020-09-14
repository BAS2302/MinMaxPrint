public class Loader {
    public static void main(String[] args) {
        int[] array = {15, 34, 5, 3, -11, 567, 2, 547, 2, 0, -12, 35};
        int min = getMin(array);
        int max = getMax(array);
        System.out.println("Minimal value = " + min + " and maximum value = " + max);
    }

    private static int getMax(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (maxValue < array[i+1]) {
                maxValue = array[i+1];
            }
        }
        return maxValue;
    }

    private static int getMin(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (minValue > array[i+1]) {
                minValue = array[i+1];
            }
        }
        return minValue;
    }
}
