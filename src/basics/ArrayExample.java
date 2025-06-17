package basics;

import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] myArray = {1, 3, 5, 7, 9};
        int[] anotherArray = new int[5];//use when values are not fixed
        String[] gender = {"Female", "Male"};//use for fixed values

        // myArray[1] = 13;/
        // anotherArray[5] = 17;
        for (int i = 0; i < anotherArray.length; i++) {
            if (anotherArray[i] == 13) {
                System.out.println("Found it");
                break;
            }
            System.out.println("Insert Item at: " + i);
            anotherArray[i] = input.nextInt();
            //System.out.println("Item at: " +i+ " is " +anotherArray[i]);
        }


        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Item at: " + i + " is " + myArray[i]);
        }//(int i = 0, start) (i < myArray.length,)

        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
            System.out.println(sum);
        }
    }

}



