package beginner.ex1012;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        TextInterface textInterface = new TextInterface();

        textInterface.input();
        textInterface.print();
    }    
}

class TextInterface
{
    private Scanner input;
    private Area area;

    public TextInterface()
    {
        input = new Scanner(System.in);
        area = new Area();
    }

    public void input()
    {
        area.setFeatures(input.nextDouble(), input.nextDouble(), input.nextDouble());
    }

    public void print()
    {
        System.out.printf("TRIANGULO: %.3f%n", area.areaTriangle());
        System.out.printf("CIRCULO: %.3f%n", area.areaCircle());
        System.out.printf("TRAPEZIO: %.3f%n", area.areaTrapeze());
        System.out.printf("QUADRADO: %.3f%n", area.areaSquare());
        System.out.printf("RETANGULO: %.3f%n", area.areaRectangle());
    }
}

class Area
{
    public static final double PI = 3.14159;
    private double a, b, c;

    public void setFeatures(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double areaTriangle()
    {
        return a * c / 2;
    }

    public double areaCircle()
    {
        return (PI * Math.pow(c, 2));
    }

    public double areaTrapeze()
    {
        return ((a + b) * c) / 2;
    }

    public double areaSquare()
    {
        return Math.pow(b, 2);
    }

    public double areaRectangle()
    {
        return a * b;
    }
}