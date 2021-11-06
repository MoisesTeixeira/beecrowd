package beginner.ex1010;

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
    private Piece piece;

    public TextInterface()
    {
        input = new Scanner(System.in);
        piece = new Piece();
    }

    public void input()
    {
        input.nextInt();
        piece.setAmount1(input.nextInt());
        piece.setValue1(input.nextDouble());

        input.nextInt();
        piece.setAmount2(input.nextInt());
        piece.setValue2(input.nextDouble());
    }

    public void print()
    {
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", piece.totalPrice());
    }
}

class Piece
{
    private int  amount1, amount2;
    private double value1, value2;

    public void setAmount1(int amount1)
    {
        this.amount1 = amount1;
    }

    public void setAmount2(int amount2)
    {
        this.amount2 = amount2;
    }

    public void setValue1(double value1)
    {
        this.value1 = value1;
    }

    public void setValue2(double value2)
    {
        this.value2 = value2;
    }

    public double totalPrice()
    {
        return (amount1 * value1) + (amount2 * value2);
    }
}