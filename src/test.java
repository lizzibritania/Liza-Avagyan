/**
 * Created by Lizzi on 16.10.2016.
 */

public class test {
    public static void main(String[] args) {
        Employee masha = new Employee(1, "masha","kozlova",5);
        System.out.println(masha.toString());
        Book.Author author1=new Book.Author();
        Book.Author author2=new Book.Author();
       Book.Author author []=new Book.Author[2];
        author[0]=author1;
        author[1]=author2;
        Book mainkamph =new Book("main1",author,5);
        System.out.println(mainkamph.toString());
        String a = "blue";
        double b = 2;
        Circle circle1 = new Circle(b, a);
        circle1.setColor("brown");
        System.out.println(circle1.toString());
        double f = circle1.getArea();
        System.out.println(f);
        myPoint point1 = new myPoint(0, 0);
        myPoint point2 = new myPoint(0, 2);
        double distance = point1.distance(point2);
        System.out.println(point1.toString());
        System.out.println(distance);

        myPoint point3 = new myPoint(2, 0);

        System.out.println(point2.toString());
        myTriangle neq = new myTriangle(1,7,9,8,8,8);

        myTriangle neq1 = new myTriangle(point1,point2,point3);
        System.out.println(neq1.toString());
        System.out.println(neq.toString());
        System.out.println(neq.getType());
        System.out.println(neq.getPerimeter());
        Rectangle rec1=new Rectangle(1,4);
        System.out.println(rec1.toString());
    }   }

