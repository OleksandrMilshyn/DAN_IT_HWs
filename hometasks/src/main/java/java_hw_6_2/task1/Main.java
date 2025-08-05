package java_hw_6_2.task1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Create an object Circle with radius 10");
        Figure circleFigure = new Circle(10);
        System.out.println("Display area of a circle");
        System.out.println(circleFigure.getArea());
        System.out.println("Display perimeter of a circle");
        System.out.println(circleFigure.getPerimeter());
        System.out.println("Crate an object Square with side 5");
        Figure squareFigure = new Square(5);
        System.out.println("Display area of a square with side 5");
        System.out.println(squareFigure.getArea());
        System.out.println("Display perimeter of a square with side 5");
        System.out.println(squareFigure.getPerimeter());
        System.out.println("Create an object Triangle with: base 6, height 4, side1 3, side2 6, side3 5");
        Figure triangleFigure = new Triangle(6, 4, 3 ,6, 5);
        System.out.println("Display area of a triangle");
        System.out.println(triangleFigure.getArea());
        System.out.println("Display perimeter of a triangle");
        System.out.println(triangleFigure.getPerimeter());


    }
}
