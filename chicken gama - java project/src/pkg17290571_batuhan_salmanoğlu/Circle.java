package pkg17290571_batuhan_salmanoğlu;
import java.text.SimpleDateFormat;

public class Circle extends Geometric_Object{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean is_it_blank) {
        this.setcolor(color);
        this.setis_it_blank(is_it_blank);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getarea(){
        double circle_area;
        circle_area=Math.PI*getRadius()*getRadius();
        return circle_area;
    }
    @Override
    public double getperimeter(){
        double perimeter_circle;
        perimeter_circle=2*Math.PI*getRadius();
        return perimeter_circle;
    }
     public void getInformation(){
        SimpleDateFormat date_time_circle = new SimpleDateFormat ("E MMM F kk:mm:ss zzz yyyy");
        System.out.print("Circle\n"); 
        System.out.print("-------------------------\n"); 
        System.out.print("Color: "+this.getcolor()+"\n");
        System.out.print("Radius: "+this.getRadius()+"\n");
        System.out.print("Area: "+this.getarea()+"\n");
        System.out.print("Perimeter: "+this.getperimeter()+"\n");
        System.out.print("Creation Date: " + date_time_circle.format(this.getcreation_date())+"\n");
        System.out.print("Is it blank: "+is_it_blank()+"\n");
        System.out.print("\n");
    }
}
