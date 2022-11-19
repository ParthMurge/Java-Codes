package company;

// Q1 & Q3 :-
class Circle1
{
	int radius;
	Circle1(int r)
	{
		this.radius = r;
	}
	public double area()
	{
		return Math.PI*this.radius*this.radius;
	}
}
class Cylinder1 extends Circle1
{
	int height;
	Cylinder1(int r, int h)
	{
		super(r);
		this.height = h;
	}
	public double volume()
	{
		return Math.PI*this.radius*this.radius*this.height;
	}
}

// Q2 & Q4 :-
class rectangle1
{
	int length, breadth;

	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int area()
	{
		return this.length*this.breadth;
	}
}
class Cuboid extends rectangle1
{
	int height;
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int volume()
	{
		return this.length*this.breadth*this.height;
	}
}


public class cwh_52_practice_set_Inheritance
{
	public static void main(String[] args)
	{
		// Question-1 --> Create a class Circle and use inheritance to create another class Cylinder from it.
		// Question-3 --> Create methods for area and volume in Q1.
		Cylinder1 cr1 = new Cylinder1(4,5);
		System.out.println("\nArea of the circle is = " +cr1.area());
		System.out.println("Volume of the cylinder is = " +cr1.volume());
		
		// Question-2 --> Create a class Rectangle and use inheritance to create another class Cuboid. Try to keep it as close to real world scenario as possible.
		// Question-4 --> Create methods for area and volume in Q2. Also create getters and setters.
		Cuboid cb = new Cuboid();
		cb.setLength(3);
		cb.setBreadth(4); 
		cb.setHeight(5);
		System.out.println("\nThe area of rectangle is = " +cb.area());
		System.out.println("The volume of cuboid is = " +cb.volume());
	}

}
