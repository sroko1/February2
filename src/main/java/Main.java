public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.calculateArea();

        // Shape square = new Square();

        Shape rectangle = new Rectangle();
        // Rectangle rectangle = new Rectangle();
        Rectangle square = new Square();

        circle.calculateArea();
        rectangle.calculateArea();

        System.out.println(circle.getName());
        System.out.println(square.getName());
        System.out.println(rectangle.getName());
        System.out.println(square.getWidth());
        // System.out.println((Square)square).getSide();


    }
}
