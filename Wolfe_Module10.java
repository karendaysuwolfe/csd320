/*
Name: Karendaysu Wolfe
Date: 12-11-22
Class: Programming with Java
Module: 10
Description: Write four overloaded methods that return the average of an array with the following headers.
 */

public class Wolfe_Module10 {
        //first one
        public static short average(short [] array) {
            short s = 0;
            for (int arrIndex = 0; arrIndex < array.length; arrIndex++) {
                s += array[arrIndex];
            }
            return (short) (s / array.length);
        }

        //second one
        public static int average(int [] array) {
            int s = 0;
            for (int arrIndex = 0; arrIndex < array.length; arrIndex++) {
                s += array[arrIndex];
            }
            return s / array.length;
        }

        //third one
        public static long average(long [] array) {
            long s = 0;
            for (int arrIndex = 0; arrIndex < array.length; arrIndex++) {
                s += array[arrIndex];
            }
            return s / array.length;
        }

        //fourth one
        public static double average(double [] array) {
            double s = 0;
            for (int arrIndex = 0; arrIndex < array.length; arrIndex++) {
                s += array[arrIndex];
            }
            return s / array.length;
        }

        //start of the array
        public static void main(String[] args) {

            //short average
            short[] n1 = {5, 8, 1, 5, 7, 9};
            System.out.print("Array 1: [");
            for (int arrIndex = 0; arrIndex < n1.length; arrIndex++) {
                System.out.print(n1[arrIndex] + " ");
            }
            System.out.println("]");
            System.out.println("Average of Short Array : " + average(n1));

            //int average
            int[] n2 = {7, 6, 9, 2, 16};
            System.out.print("Array 2: [");
            for (int arrIndex = 0; arrIndex < n2.length; arrIndex++) {
                System.out.print(n2[arrIndex] + " ");
            }
            System.out.println("]");
            System.out.println("Average of Int Array : " + average(n2));

            //long average
            long[] n3 = {253, 414, 644, 876, 103};
            System.out.print("Array 3: [");
            for (int arrIndex = 0; arrIndex < n3.length; arrIndex++) {
                System.out.print(n3[arrIndex] + " ");
            }
            System.out.println("]");
            System.out.println("Average of Long Array : " + average(n3));

            //double average
            double[] n4 = {5.4, 4.8, 9.12};
            System.out.print("Array 4: [");
            for (int arrIndex = 0; arrIndex < n4.length; arrIndex++) {
                System.out.print(n4[arrIndex] + " ");
            }
            System.out.println("]");
            System.out.println("Average of Double Array : " + average(n4));

}
}