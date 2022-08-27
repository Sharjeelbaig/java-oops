import java.util.Scanner;
public class CircleRadiusAndColor {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       Circle c=new Circle(); //creating object of a circle class
       System.out.print(" Input Color of a Circle: ");
       String color=input.next();
       c.setcolor(color);      
       System.out.print(" Input radius of a Circle: ");
       double radius=input.nextDouble();
       c.setradius(radius);
       System.out.println(" *********************************");
       System.out.println("The Color of a Circle is " + c.getcolor());
       System.out.println("The radius of a Circle is: " + c.getradius());}
       }

public class Circle {
    private String color; //private color variable
    private double radius; //private radius variable
//============================================================//
    /* The method for setting color */
    public void setcolor(String color){
        this.color=color;}
        /* End of the method for getting color */
//============================================================//
/* The method for getting color */
    public String getcolor(){
        return color;}
/* End of the method for getting color */
//============================================================//
/*Method for setting radius */
    public void setradius(double radius){
        this.radius=radius;}
/*End of the method for setting radius */
//============================================================//
/*Method for getting radius */
    public double getradius(){
        return radius;}
/*End of the method for setting radius */
//============================================================//
        }