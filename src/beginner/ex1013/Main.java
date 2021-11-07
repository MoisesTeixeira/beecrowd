package beginner.ex1013;

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
    private HigherNumber higherNumber;

    public TextInterface()
    {
        input = new Scanner(System.in);
        higherNumber = new HigherNumber();
    }

    public void input()
    {
        higherNumber.setFetures(input.nextInt(), input.nextInt(), input.nextInt());
    }

    public void print()
    {
        System.out.printf("%d eh o maior%n", higherNumber.higherNumber());
    }
}

class HigherNumber
{
    private int n1, n2, n3;

    public void setFetures(int n1, int n2, int n3)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public int higherNumber()
    {

        int firstComparison  = (n1 + n2 + Math.abs(n1 - n2)) / 2;

        int finalComparison = (firstComparison + n3 + Math.abs(firstComparison - n3)) / 2;

        return finalComparison;
    }
}