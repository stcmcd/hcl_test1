package steve.step_definitions;

import org.junit.Test;

import java.util.Scanner;
class AreaTriangle {

    @Test
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Width of triangle:");
        double width = scanner.nextDouble();

        System.out.println("Height of triangle:");
        double height = scanner.nextDouble();

        double area = (width* height)/2;
        System.out.println("Area of Triangle: " + area);
    }
}