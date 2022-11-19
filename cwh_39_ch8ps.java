package company;

import java.lang.*;

//Q1:
class Employee1{

 int salary;
 String name;

 public int getSalary(){
     return salary;
 }
 public String getName(){
     return name;
 }
 public void setName(String n){
     name = n;
 }
}

//Q2:
class CellPhone{

 public void ring(){
     System.out.println("\nRinging..");
 }
 public void vibrate(){
     System.out.println("Vibrating..");
 }
}

//Q3:
class square{

 int side;

 public int area(int side){
     return side*side;
 }
 public int perimeter(int side){
     return 4*side;
 }
}

//Q4:
class rectangle{

 int l,b;

 public int areaRect(int l, int b){
     return l*b;
 }
 public int perimeterRect(int l, int b){
     return 2*(l+b);
 }
}

class circle{

 int r;

 public float areaCircle(int r){
     return (float)3.14*r*r;
 }
 public float perimeterCircle(int r){
     return (float)3.14*2*r;
 }
}

public class cwh_39_ch8ps
{
 
 public static void main(String[] args)
 {
     
     /* Question - 1 --> Create a class Employee with following methods and properties:
     salary (property) (int)
     getSalary (method returning int)
     name (property) (String)
     getName (method returning String)
     setName (method changing name) */

     Employee1 emp = new Employee1();

     emp.salary = 300000;
     emp.name = "Rao";
     emp.setName("Baji");

     System.out.println(emp.getSalary());
     System.out.println(emp.getName());

     // Question - 2 --> Create a class CellPhone with methods to print "ringing..", "Vibrating..", etc
     CellPhone samsung = new CellPhone();
     samsung.ring();
     samsung.vibrate();

     // Question - 3 --> Create a call square initializing its side, and create methods to calculate its area and perimeter.
     square sq = new square();
     sq.side = 3;
     System.out.println("\nThe area of the square is = " +sq.area(sq.side));
     System.out.println("The perimeter of the square is = " +sq.perimeter(sq.side));
     
     // Question - 4 --> Repeat question 3 for rectangle.
     rectangle rt = new rectangle();
     rt.l = 3;
     rt.b = 4;
     System.out.println("\nThe area of the rectangle is = " +rt.areaRect(rt.l, rt.b));
     System.out.println("The perimeter of the rectangle is = " +rt.perimeterRect(rt.l, rt.b));

     // Question - 5 --> Repeat question 3 for circle
     circle cr = new circle();
     cr.r = 3;
     System.out.println("\nThe area of the circle is = " +cr.areaCircle(cr.r));
     System.out.println("The perimeter of the circle is = " +cr.perimeterCircle(cr.r));

 }
}

