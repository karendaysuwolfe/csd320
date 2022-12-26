// Name: Karendaysu Wolfe
// Date: 12-17-22
// Class: Programming with Java
// Module: 11
// Description: Write methods using the following headers that returns the location of the largest element in the array passed to the method returning a one-dimensional array that contains two location elements.



import java.util.Arrays;

public class WolfeKarendaysu_Module11 {
// writing methods using headers that returns the location of the largest element  in the array
    // the method using one dimensional array that contains two locations elements
    public static int[] locateLargest(double[][] arrayParam) {//first method
        int[] result = {0, 0};
        double largest = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] locateLargest(int[][] arrayParam) { //second method
        int[] result = {0, 0};
        int largest = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
// write methods using the following headers that returns the location of the smallest element in the array
// passed to the method returning a one-dimensional array that contains two location elements.
    public static int[] locateSmallest(double[][] arrayParam) { // first method
        int[] result = {0, 0};
        double smallest = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] locateSmallest(int[][] arrayParam) { // second method
        int[] result = {0, 0};
        int smallest = arrayParam[0][0];
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
// Input the values
    public static void main(String[] args) {
        int[][] intArray = {{1, 2, 3}, {20, 48, -88}, {14, 16, -102}};
        double[][] doubleArray = {{15.54, 88, 88.09}, {-101.25, -99.54, 15}, {48.67, 66.1, 86.51}};
// printing the results of the four methods
        System.out.println("The Largest Value In The Double Array Is: " + Arrays.toString(locateLargest(doubleArray)));
        System.out.println("The Largest Value In The Int Array Is: " + Arrays.toString(locateLargest(intArray)));

        System.out.println("The Smallest Value In The Double Array Is: " + Arrays.toString(locateSmallest(doubleArray)));
        System.out.println("The Smallest Value In The Int Array Is: " + Arrays.toString(locateSmallest(intArray)));


    }
}