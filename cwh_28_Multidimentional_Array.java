package company;

public class cwh_28_Multidimentional_Array {

	public static void main(String[] args) {
		
		int[][] flats = new int [2][3]; // 2-D Array
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        
        // Printing the 2-D Array using for-loop:
        System.out.println("\nPrinting the 2-D Array using for-loop:\n");
        for(int i=0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("\n");

	}

}
