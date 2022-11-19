package company;

import java.lang.String;

class Employee3
{

    private int id;
    private String name;

    public Employee3(int i, String n)
    {
        id = i;
        name = n;
    }

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

public class cwh_41_Constructors
{

	public static void main(String[] args)
	{
		// Costructors :- A member function used to initialize an object while creating it.
        // In order to write our own constructor, we need to define a method with the name same as class-name.

        Employee3 em = new Employee3(4, "LordSnow");
        em.setId(3);
        System.out.println(em.getId());
        System.out.println(em.getName());
	}
}
