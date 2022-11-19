package company;

public class cwh_27_Display_Array {

	public static void main(String[] args){

        int [] marks = {20, 40, 56, 65, 92};
        
        // Dislaying the array using Naive Way:
        System.out.println("Displaying the array using Naive Way:");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the array using for loop:
        System.out.println("Displaying the array using for loop:");
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        
        // Displaying the array using for loop (in reverse order):
        System.out.println("Displaying the array using for loop (in reverse order):");
        for(int i = (marks.length-1); i >= 0; i--){
            System.out.println(marks[i]);
        }

        // Displaying the array using for-each loop:
        System.out.println("Displaying the array using for-each loop:");
        for(int element : marks){
            System.out.println(element);
        }

    }

}
