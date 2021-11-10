package beginner.ex1015;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        UserInterface userInterface = new UserInterface();

        userInterface.input();
        userInterface.print();
    }    
}

class UserInterface
{
    private Scanner input;
    private Plane plane;

    public UserInterface()
    {
        input = new Scanner(System.in);
        plane = new Plane();
    }

    public void input()
    {
        plane.setX1(input.nextDouble());
        plane.setY1(input.nextDouble());
        plane.setX2(input.nextDouble());
        plane.setY2(input.nextDouble());
    }

    public void print()
    {
        System.out.printf("%.4f%n", plane.distanceBetweenPoints());
    }
}

class Plane
{
    private double x1, x2, y1, y2;

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
 
    public double distanceBetweenPoints()
    {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}