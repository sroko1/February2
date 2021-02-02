public class Circle extends Shape {

    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
    }
    public Circle(double radius,Shape shape){
        this.radius = radius;
        this.shape = shape;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public String getName() {
        return super.getName() + ":Circle";
    }
}
