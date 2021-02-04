package Abstrakty;

public class Square extends Rectangle {
    private double side;
    //private double side ;

    public Square() {

    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {

        super(side,side,color,filled);

    }

    public double getSide() {
        return super.length;
    }

    public void setSide(double side) {
        super.length = side;
        super.width = side;
    }


    public String getName() {
        return "Square";
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        setSide(side);
    }


    public void setLength(double length) {
        setSide(side);
    }

    @Override
    public String getName(String name) {
        return super.getName(name);
    }



}