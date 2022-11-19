package company;

class cylinder {

    private int radius, height;

    public void setRadius(int r) {this.radius = r;}
    public int getRadius() {return this.radius;}
    public void setHeight(int h) {this.height = h;}
    public int getHeight() {return height;}

    public double surfaceArea() { return ((2 * Math.PI * radius * height)+(2 * Math.PI * radius * radius)); }
    public double volume() { return (Math.PI * radius * radius * height); }

    // public cylinder(int r, int h){
    //     radius = r;
    //     height = h;
    // }

}

class rectangle2 {

    private int length, breadth;

    public rectangle2() {
        this.length = 4;
        this.breadth = 5;
    }
    public rectangle2(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int getLength() { return length; }
    public int getBreadth () { return breadth; }
}

class sphere {

    private int radius, height;

    public void setRadius(int r) {radius = r;}
    public int getRadius() { return radius;}
    public void setHeight(int h) {height = h;}
    public int getHeight() { return height;}

    public double surfaceArea() { return (4 * Math.PI * radius * radius); }
    public double volume() { return ((4.0/3.0) * Math.PI * radius * radius * radius); }
}

public class cwh_42_practise_set_Constructors
{

	public static void main(String[] args)
	{
		/*  Question-01 --> Create a class "cylinder", and also create getters & setters
        to get & set its radius & height.  */
        cylinder cy = new cylinder();
        cy.setRadius(4);
        System.out.println(cy.getRadius());
        cy.setHeight(8);
        System.out.println(cy.getHeight());

        /*  Question-02 --> Use Q-01 to calculate surface area & volume of the cylinder. */
        double area = cy.surfaceArea();
        System.out.println("\nThe surface area of the cylinder is = " +area);
        double volume = cy.volume();
        System.out.println("The volume of the cylinder is = " +volume+ "\n");

        /*  Question-03 --> Use a constructor and repeat Q-01 */
        // cylinder c = new cylinder(4, 4);
        // System.out.println(c.getHeight());
        // System.out.println(c.getRadius());
        // double sa = c.surfaceArea();
        // System.out.println(sa);
        // double v = c.volume();
        // System.out.println(v);

        /*  Question-04 -->  Overload a constructor used to initialize a rectangle of length 4 & breadth 5 for using custom parameters.*/
        rectangle2 re = new rectangle2();
        System.out.println(re.getLength());
        System.out.println(re.getBreadth());

        rectangle2 r = new rectangle2(12, 19);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

        System.out.println();

        /*  Question-05 --> Repeat Q-01 for a sphere. */
        sphere sp = new sphere();
        sp.setRadius(5);
        System.out.println(sp.getRadius());
        sp.setHeight(7);
        System.out.println(sp.getHeight());

        System.out.println(sp.surfaceArea());
        System.out.println(sp.volume());


	}

}
