/**
 * Created by Lizzi on 16.10.2016.
 */
import static java.lang.Math.pow;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author Lizzi
 */
public class Rectangle {




    float length;
    float width;
    Rectangle()
    {length=1.0f;
        width=1.0f;}
    Rectangle(float l, float w){length=l;
        width=w;}

    public float getLength()
    {return length;}
    float getWidth()
    {return width;}
    public void setLength(float l)
    { length=l;}
    public void setWidth(float w)
    { width=w;}
    public String toString()
    {return "Rectangle [ length="+length+", width="+width +" ]";

    }
    double getArea()
    {return (double)length*width;}

    double getPerimetr()
    {return (double)2*length+2*width;}


}