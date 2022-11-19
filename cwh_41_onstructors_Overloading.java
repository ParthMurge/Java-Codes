package company;

import java.lang.String;

class Employee4
{
    private int id;
    private String name;

    // constructors:
    public Employee4(int i, String n)
    {
        id = i;
        name = n;
    }
    public Employee4(String n)
    {
        name = n;
    }
    
    // getters & setters:
    public void setName(String a)
    {
        this.name = a;            // We can also write "name" as "this.name"
    }
    public void setId(int a)
    {
        id = a;
    }
    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return this.id;          // We can also write "id" as "this.id"
    }
}

public class cwh_41_onstructors_Overloading
{
	public static void main(String[] args)
	{
		// Constructors can be overloaded just like other methods in java.
        // There can be more than two overloaded constructors.

        Employee4 e = new Employee4(4, "Danny");
        Employee4 em = new Employee4("Khaleesi");

        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(em.getName());
	}
}
