package beginner.ex1006;

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
    private Average average;

    public TextInterface()
    {
        input = new Scanner(System.in);
        average = new Average();
    }

    public void input()
    {
        average.setNote1(input.nextDouble());
        average.setNote2(input.nextDouble());
        average.setNote3(input.nextDouble());
    }

    public void print()
    {
        System.out.printf("MEDIA = %.1f%n", average.weightedAverage());
    }
}

class Average
{
    private double note1, note2, note3;

    public void setNote1(double note1)
    {
        this.note1 = noteValidator(note1);
    }

    public void setNote2(double note2)
    {
        this.note2 = noteValidator(note2);
    }

    public void setNote3(double note3)
    {
        this.note3 = noteValidator(note3);
    }

    public double noteValidator(double note)
    {
        if (note >= 0 && note <= 10)
            return note;
        
        return 0;
    }

    public double weightedAverage()
    {
        double weight1 = 2, weight2 = 3, weight3 = 5;

        return ((note1 * weight1) + (note2 * weight2) + (note3 *weight3)) / 10;
    }
}