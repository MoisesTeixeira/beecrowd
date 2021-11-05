package beginner.ex1007;

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
    private Difference difference;

    public TextInterface()
    {
        input = new Scanner(System.in);
        difference = new Difference();
    }

    public void input()
    {
        difference.setValue1(input.nextInt());
        difference.setValue2(input.nextInt());
        difference.setValue3(input.nextInt());
        difference.setValue4(input.nextInt());
    }

    public void print()
    {
        System.out.printf("DIFERENCA = %d%n", difference.difference());
    }
}

class Difference
{
    private int value1, value2, value3, value4;

    public void setValue1(int value1)
    {
        this.value1 = value1;
    }

    public void setValue2(int value2)
    {
        this.value2 = value2;
    }

    public void setValue3(int value3)
    {
        this.value3 = value3;
    }

    public void setValue4(int value4)
    {
        this.value4 = value4;
    }

    public int difference()
    {
        return (value1 * value2) - (value3 * value4);
    }
}
