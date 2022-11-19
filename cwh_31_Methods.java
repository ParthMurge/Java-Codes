package company;

public class cwh_31_Methods {

	static int logic(int x, int y) {
		
		int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x+y)*5;
        }
        return z;
    }
    
    public static void main(String[] args){

        int a = 4, b = 5;
        int c;
        c = logic(a, b);

        int a1 = 6, b1 = 5;
        int c1;
        c1 = logic(a1, b1);
        /* Method Invocation by Object creation
         * cwh_31_Methods obj = new cwh_31_Methods();
         * c1 = obj.logic(a1, b1);
         */

        System.out.println(c);
        System.out.println(c1);

	}

}
