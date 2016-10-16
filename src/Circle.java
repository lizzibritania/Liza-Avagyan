/**
 * Created by Lizzi on 16.10.2016.
 */
import static java.lang.Math.pow;

/**
 * Created by Lizzi on 14.10.2016.
 */
public class Circle {
    double radius;
    String color;
    Circle()
    {radius=1.0;
        color="red";}
    Circle(double r){radius=r;
        color="red";}
    Circle(double r, String c)
    {radius=r;
        color=c;}
    public double getRadius()
    {return radius;}
    String getColor()
    {return color;}
    public void setRadius(double r)
    { radius=r;}
    public void setColor(String c)
    { color=c;}
    public String toString()
    {return "Circle [ radius="+radius+", color="+color +" ]";

    }
    double getArea()
    {return pow(radius,2)*Math.PI;}

}