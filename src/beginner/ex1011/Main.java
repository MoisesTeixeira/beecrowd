package beginner.ex1011;

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
    private Circumference circumference;

    public TextInterface()
    {
        input = new Scanner(System.in);
        circumference = new Circumference(input.nextInt());
    }

    public void print()
    {
        System.out.printf("VOLUME = %.3f%n", circumference.volume());
    }
}

class Circumference
{
    public static final double PI = 3.14159;
    private int ray;

    public Circumference(int ray)
    {
        this.ray = ray;
    }

    public double volume()
    {
        return (4 / 3.0) * PI * Math.pow(ray, 3);
    }
}