package ex1001;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        TextInterface data = new TextInterface();

        data.print();
    }    
}

class TextInterface
{
    private Scanner input;
    private SumOfTwoValues result;

    public TextInterface()
    {
        input = new Scanner(System.in);
        result = new SumOfTwoValues(input.nextInt(), input.nextInt());
    }

    public void print()
    {
        System.out.printf("X = %d%n", result.getSumResult());
    }
}

class SumOfTwoValues
{
    private int valueOne, valueTwo, sumResult;

    public SumOfTwoValues(int valueOne, int valueTwo)
    {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    public int getSumResult()
    {
        sumResult = valueOne + valueTwo;

        return sumResult;
    }
}