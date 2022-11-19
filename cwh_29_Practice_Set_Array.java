package company;

public class cwh_29_Practice_Set_Array {

	public static void main(String[] args) {
		
		// Question - 1 --> Make an array of five elements and calculate there sum.
        float[] marks = { 45.7f, 53.9f, 57.2f, 32.7f, 80.1f };
        float sum = 0;

        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("\nThe sum of the array elements is = " + sum + "\n");

        // Question -2 --> WAP to find whether an given integer is present in the array
        // or not.
        float[] marks1 = { 45.7f, 53.9f, 57.2f, 32.7f, 80.1f };
        float num = 53.9f;
        boolean isAnArray = false;

        for (float element : marks1) {
            if (num == element) {
                isAnArray = true;
                break;
            }
        }

        if (isAnArray == true) {
            System.out.println("\nThe value is present in the array.\n");
        } else {
            System.out.println("\nThe value is not present in the array.\n");
        }

        /* Question - 3 --> Calculate the average marks of an array containing marks of
        a student.  */
        float[] marks3 = { 45.7f, 53.9f, 57.2f, 32.7f, 80.1f };
        float sum1 = 0;

        for (float element : marks3) {
            sum1 = sum1 + element;
        }
        System.out.println("\nThe average of marks is = " + sum1 / marks3.length + "\n");

        // Question - 4 --> Calculate the addition of two matrices of 2x3.
        int[][] mat1 = { { 1, 4, 6 },
                         { 3, 5, 2 } };

        int[][] mat2 = { { 2, 5, 3 },
                         { 13, 5, 8 } };

        int[][] result = { { 0, 0, 0 },
                           { 0, 0, 0 } };

        System.out.println("The sum of the two matrices is:");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // Question - 5 --> WAP to reverse an array.
        int[] arr = { 1, 2, 3, 4, 5 };
        int l = arr.length;
        int n = Math.floorDiv(l, 2);

        for (int i = 0; i < n; i++) {
            // Swap arr[i] with arr[l-1-i]
            int temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;
        }
        // Displaying the reversed array using for-each loop:
        System.out.println("\nThe reversed array is:");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        // Question - 6 --> Find the maximum valued element in an array.
        int[] arr2 = { 20, 31, 47, 3, 76, 8, 0, 53 };
        int max = 0;
        // int max = Integer.MIN_VALUE;  // OR for [int max = 0;]

        for(int e: arr2){
            if(e > max){
                max = e;
            }
        }
        System.out.println("\n\nThe maximum valued element in the array is = " +max);

        // Question - 7 --> Find the minimum valued element in an array.
        int[] arr3 = { 20, 31, 47, 3, 76, 8, 9, 53};
        // int max1 = arr3[0];
        int max1 = Integer.MAX_VALUE; // This gives the maximum value JAVA can hold.

        for(int e: arr3){
            if(e < max1){
                max1 = e;
            }
        }
        System.out.println("\nThe minimum valued element in the array is = " +max1);
        
        // Question - 8 --> Check if the array is sorted or not.
        int [] arr4 = {20, 31, 47, 76, 81, 92, 531};
        boolean isSorted = true;

        for(int i=0; i<arr4.length-1; i++){
            if(arr4[i] > arr4[i+1]){
                isSorted = false;
            }
        }

        if (isSorted == false) {
            System.out.println("\nThe given array is not sorted.");
        } else {
            System.out.println("\nThe given array is sorted.\n");
        }

	}

}
