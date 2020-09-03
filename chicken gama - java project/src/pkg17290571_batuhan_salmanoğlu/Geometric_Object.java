package pkg17290571_batuhan_salmanoğlu;
import java.util.Date;

public abstract class  Geometric_Object {
    private String color;
    private boolean  is_it_blank;
    private Date  creation_date;

    public Geometric_Object(String color, boolean is_it_blank, Date creation_date) {
        this.color = color;
        this.is_it_blank = is_it_blank;
        this.creation_date = creation_date;
    }
    public Geometric_Object() {
        color="Red";
        is_it_blank=false;
        creation_date = new Date();
    }
    
    public String getcolor() {
        return color;
    }
    public void setcolor(String color) {
        this.color = color;
    }
    public boolean is_it_blank() {
        return is_it_blank;
    }
    public void setis_it_blank(boolean is_it_blank) {
        this.is_it_blank = is_it_blank;
    }
    public Date getcreation_date() {
        return creation_date;
    }
    public void setcreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    abstract public  double getarea();
    abstract public  double getperimeter();
}




