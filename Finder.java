public class Finder {

    public static Integer findMax(int[] intArray) {
        if (intArray == null) {
            return null;
        }
        else {
            int max = intArray[0];
            for (int i = 1; i < intArray.length; i++) {
                if (intArray[i] > max) {
                    max = intArray[i];
                }
            }
            return max;
        }
    }

    public static Integer findMin(int[] intArray) {
        if (intArray == null) {
            return null;
        }
        else {
            int min = intArray[0];
            for (int i = 1; i < intArray.length; i++) {
                if (intArray[i] < min) {
                    min = intArray[i];
                }
            }
            return min;
        }
    }

}
