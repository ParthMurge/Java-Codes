package company;

class Employee{

    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("\nMy name is " +name);
        System.out.println("My id is " +id);
        System.out.println("My salary is " +salary);
    }

    public int getSalary(int a){
        return salary = a;
    }
}

public class cwh_38_custom_class
{
	public static void main(String[] args)
	{
        Employee e = new Employee();
        Employee a = new Employee();
        e.name = "Bang";
        e.id = 19;
        e.printDetails();
        e.salary = 45;

        a.name = "GangBang";
        a.id = 24;
        a.getSalary(65);
        a.printDetails();

        int salary1 = a.getSalary(65);
        System.out.println("\n" +salary1);
    }

}
