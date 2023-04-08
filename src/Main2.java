import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Enter C for Circle
                Enter R for Rectangle
                Enter T for Triangle""");
        String name = sc.nextLine();

        switch (name) {
            case "C", "c" -> {
                System.out.println("Enter the radius of the Circle");
                double radius = sc.nextDouble();
                System.out.println("The area of Circle is: " + new Circle(radius).getArea());
            }
            case "R", "r" -> {
                System.out.println("Enter the width of the Rectangle");
                double width = sc.nextDouble();
                System.out.println("Enter the length of the Rectangle");
                double length = sc.nextDouble();
                System.out.println("The area of Rectangle is: " + new Rectangle(width, length).getArea());
            }
            case "T", "t" -> {
                System.out.println("Enter the base of the Triangle");
                double base = sc.nextDouble();
                System.out.println("Enter the height of the Triangle");
                double height = sc.nextDouble();
                System.out.println("The area of Rectangle is: " + new Triangle(base, height).getArea());
            }
        }
    }
}
