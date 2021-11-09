package beginner.ex1014;

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
    private Consumption consumption;

    public UserInterface()
    {
        input = new Scanner(System.in);
        consumption = new Consumption();
    }

    public void input()
    {
        consumption.setKm(input.nextInt());
        consumption.setLiters(input.nextDouble());
    }

    public void print()
    {
        System.out.printf("%.3f km/l%n", consumption.averageConsumption());
    }
}

class Consumption
{
    private int km;
    private double liters;

    public void setKm(int km) {
        this.km = km;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    public double averageConsumption()
    {
        return km / liters;
    }
}