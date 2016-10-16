/**
 * Created by Lizzi on 16.10.2016.
 */
/**
 * Created by Lizzi on 14.10.2016.
 */

public class myTriangle {


    private myPoint v1=new myPoint();
    private myPoint v2=new myPoint();
    private myPoint v3=new myPoint();

    myTriangle(){
        v1.setXY(0,0);
        v2.setXY(0,0);
        v3.setXY(0,0);

    }
    myTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1.setXY(x1, y1);
        this.v2.setXY(x2, y2);
        this.v3.setXY(x3, y3);


    }

    myTriangle(myPoint v1, myPoint v2, myPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    @Override
    public String toString() {
        return "myTriangle{" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", v3=" + v3.toString() +
                '}';
    }
    public double getPerimeter(){

        return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);}

    public String getType() {
        String type;
        double a=v1.distance(v2);
        double b=v2.distance(v3);
        double c=v3.distance(v1);
        if((a==b)&&(b==c)&&(c==a))
            type="equilateral";
        else if((a==b)||(b==c)||(c==a))
            type="isosceles";
        else
            type="scalene";




        return type;

    }




}

