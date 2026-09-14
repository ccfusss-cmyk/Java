import java.util.Scanner;
abstract class Shape {
// Abstract method
abstract void area();
}
// Circle class
class Circle extends Shape {
double radius;
Circle(double radius) {
this.radius = radius;
}
@Override
void area() {
double result = Math.PI * radius * radius;
System.out.println("Area of Circle = " + result);
}
}
// Rectangle class
class Rectangle extends Shape {
double length, width;
Rectangle(double length, double width) {
this.length = length;
this.width = width;
}
@Override
void area() {
double result = length * width;
System.out.println("Area of Rectangle = " + result);
}
}
// Triangle class
class Triangle extends Shape {
double base, height;
Triangle(double base, double height) {
this.base = base;
this.height = height;
}
@Override
void area() {
double result = 0.5 * base * height;
System.out.println("Area of Triangle = " + result);
}
}
// Main class
public class ShapeDemo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Shape shape;
int choice;
do {
System.out.println("\n----- Geometric Shape Area Calculator -----");
System.out.println("1. Circle");
System.out.println("2. Rectangle");
System.out.println("3. Triangle");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
choice = sc.nextInt();

switch (choice) {
case 1:
System.out.print("Enter radius: ");
double radius = sc.nextDouble();
shape = new Circle(radius);
shape.area();
break;
case 2:
System.out.print("Enter length: ");
double length = sc.nextDouble();
System.out.print("Enter width: ");
double width = sc.nextDouble();
shape = new Rectangle(length, width);
shape.area();
break;
case 3:
System.out.print("Enter base: ");
double base = sc.nextDouble();
System.out.print("Enter height: ");
double height = sc.nextDouble();
shape = new Triangle(base, height);
shape.area();
break;
case 4:
System.out.println("Exiting program...");
break;
default:
System.out.println("Invalid choice!");
}
} while (choice != 4);
sc.close();
}
}
