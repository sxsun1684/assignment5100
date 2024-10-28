package part1;

/**Initiate two integer arrays, x, and y, each containing 5 numbers.
 * Create another array z of length 5, the elements of which are the max of the respective numbers of the two arrays x and y.
 * Organize a nice-looking output to the terminal that looks like the following:
 * Array x = { array x values here separated by coma }
 * Array y = { array y values here separated by coma }
 * Array z = x + y = { array z values here separated by coma }
 */

public class part1 {
    // Helper method to convert array to a comma-separated string
    public static String trans(int[] array) {
        String str = "{ ";
        for (int i = 0; i < array.length; i++) {
            str += array[i];
            if (i < array.length - 1) {
                str += ", ";
            }
        }
        str += " }";
        return str;
    }
    public static void main(String[] args) {
        int[] x = {1, 5, 7, 9, 3};
        int[] y = {2, 4, 6, 8, 10};
        int[] z = new int[5];

        // Populate array z with max values
        for (int i = 0; i < z.length; i++) {
            z[i] = Math.max(x[i], y[i]);
        }
        // Print arrays in the required format
        System.out.println("Array x=" + trans(x));
        System.out.println("\nArray y=" + trans(y));
        System.out.println("\nArray z = x + y =" + trans(z));
    }



}
