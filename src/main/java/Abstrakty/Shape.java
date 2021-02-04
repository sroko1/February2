package Abstrakty;

public abstract class Shape extends Object {

    public Shape shape;

    private String color = "red";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;


    }


    public abstract double calculateArea();

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getName() {
        return "Shape";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getName(String name) {
        return name + ":Shape";
    }


}
