package company;

public class cwh_26_Array {
	public static void main(String[] args) {

	/* Array is the collection of similar elements.
    There are three main ways to create an array:
    1. Declaration + Memory Allocation and then Initialization
    2. Declaration and then Memory Allocation
    3. Declaration, Memory Allocation, and Initialization together */

    // 1. Declaration + Memory Allocation and then Initialization:
    int[] marks = new int[5];
    marks[0] = 69;
    marks[1] = 79;
    marks[2] = 56;
    marks[3] = 20;
    marks[4] = 19;
    System.out.println(marks[3]);

    // 2. Declaration and then Memory Allocation:
    int[] marks1;
    marks = new int[5];

    // 3. Declaration, Memory Allocation, and Initialization together:
    int[] marks2 = {1,2,3,4,5};
	}
}
