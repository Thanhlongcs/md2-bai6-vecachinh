package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        // test class shape
        System.out.println("---------shape_-------");
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
        // test class circle
        System.out.println("--------circle-------");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(5.5);
        System.out.println(circle);
        circle = new Circle(3.5,"indigo", false);
        System.out.println(circle);
        // test  rectangle
        System.out.println( " -------rectangle-------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3,5.8);
        System.out.println(rectangle);
        System.out.println(rectangle);
        rectangle = new Rectangle("orange",true,2.5,3.8);
        System.out.println(rectangle);

    }
}
