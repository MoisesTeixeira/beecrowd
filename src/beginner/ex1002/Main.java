package beginner.ex1002;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        TextInterface textInterface = new TextInterface();

        textInterface.print();
    }
}

class TextInterface
{
    private Scanner input;
    private Circle circle;

    public TextInterface()
    {
        input = new Scanner(System.in);
        circle = new Circle(input.nextDouble());
    }

    public void print()
    {
        System.out.printf("A=%.4f%n", circle.areaCalculation());
    }
}

class Circle
{
    public static final double PI = 3.14159;
    private double ray, area;

    public Circle(double ray)
    {
        this.ray = ray;
    }

    public double areaCalculation()
    {
        area = PI * Math.pow(ray, 2);
        
        return area;
    }
}