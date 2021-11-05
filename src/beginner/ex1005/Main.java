package beginner.ex1005;

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

    private Average average;

    public TextInterface()
    {
        input = new Scanner(System.in);
        average = new Average(input.nextDouble(), input.nextDouble());
    }

    public void print()
    {
        System.out.printf("MEDIA = %.5f%n", average.getWeightedAverage());
    }
}

class Average
{
    private double note1, note2, weightedAverage;

    public Average(double note1, double note2)
    {
        this.note1 = noteValidator(note1);
        this.note2 = noteValidator(note2);
    }

    public double getWeightedAverage()
    {
        double weight1 = 3.5, weight2 = 7.5;

        weightedAverage = ((note1 * weight1) + ( note2 * weight2)) / 11;
        
        return weightedAverage; 
    }

    public double noteValidator(double value)
    {
        if (value >= 0 && value <= 10)
            return value;
        
        return 0;
    }
}
