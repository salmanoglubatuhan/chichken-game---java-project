package pkg17290571_batuhan_salmanoğlu;
import java.text.SimpleDateFormat;


public class Rectangle extends Geometric_Object{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean is_it_blank) {
        this.setcolor(color);
        this.setis_it_blank(is_it_blank);
        this.width = width;
        this.height = height;
    }

   
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
        @Override
     public double getarea(){
         double area;
         area=this.height*this.width;
         return area;
     }
     @Override
     public double getperimeter(){
         double perimeter;
         perimeter=2*this.height + 2*this.width;
         return perimeter;
    }
     public void getInformation(){
        
        SimpleDateFormat date_time_rectangle = new SimpleDateFormat ("E MMM F kk:mm:ss zzz yyyy");
        System.out.print("\n");
        System.out.print("Rectangle\n");
        System.out.print("-------------------------\n");
        System.out.print("Color: "+this.getcolor()+"\n");        
        System.out.print("Width: "+this.getWidth()+"\n");
        System.out.print("Height: "+this.getHeight()+"\n");
        System.out.print("Area: "+this.getarea()+"\n");
        System.out.print("Perimeter: "+this.getperimeter()+"\n");
        System.out.print("Creation Date: " + date_time_rectangle.format(this.getcreation_date())+"\n");
        System.out.print("Is it blank: "+is_it_blank()+"\n");
        System.out.print("\n");
        
    }
}


