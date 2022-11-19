package company;

import java.lang.String;

class Employee2
{

    private int id;
    private String name;

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

public class cwh_40_getters_and_setters
{

	public static void main(String[] args)
	{
		Employee2 em = new Employee2();
        // em.name = "HeParth";
        // em.id = 19;         -->This will show error bqz of the private access modifier, and so we use getters and setters.

        em.setName("He_Parth");
        em.setId(19);
        System.out.println("\n" +em.getName());
        System.out.println(em.getId()+ "\n");
	}
}
