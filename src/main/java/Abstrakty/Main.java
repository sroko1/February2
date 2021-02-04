package Abstrakty;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle();
        circle.calculateArea();

        // Shape square = new Square();

        //Shape rectangle = new Rectangle();
         Rectangle rectangle = new Rectangle(3,4,"green",true);
        System.out.println(rectangle);


        //Rectangle square = new Square();
        Square square = new Square(5);
        Square square1 = new Square(5,"black",false);
        square1.setWidth(3);

        square.setColor("yellow");
        square.setFilled(true);
        System.out.println(square);
        square.setLength(3);
        System.out.println(square.getLength());
        System.out.println(square.getSide());


    }
}
