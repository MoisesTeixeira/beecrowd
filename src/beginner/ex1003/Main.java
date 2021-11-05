package beginner.ex1003;

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
    private Calculator calculator;
    
    public TextInterface()
    {
        input = new Scanner(System.in);
        calculator = new Calculator(input.nextInt(), input.nextInt());
    }

    public void print()
    {
        System.out.printf("SOMA = %d%n",calculator.getResult());
    }
}

class Calculator
{
    private int valueOne, valueTwo, result;

    public Calculator(int valueOne, int valueTwo)
    {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }
    
    public int getResult()
    {
        result = valueOne + valueTwo;

        return result;
    }
}