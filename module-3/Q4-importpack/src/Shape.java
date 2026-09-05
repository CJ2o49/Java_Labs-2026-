public abstract class Shape {

    // Abstract method
    abstract double getArea();

    // Concrete method
    void describe() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

class Main {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(10, 4)
        };

        for (Shape shape : shapes) {
            shape.describe();
            System.out.println("Area: " + shape.getArea());
            System.out.println();
        }

    }
}