package beginner.ex1009;

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
    private Salary salary;

    public TextInterface()
    {
        input = new Scanner(System.in);
        salary = new Salary();
    }

    public void input()
    {
        input.nextLine();
        salary.setFixedSalary(input.nextDouble());
        salary.setTotalSales(input.nextDouble());
    }

    public void print()
    {
        System.out.printf("TOTAL = R$ %.2f%n", salary.salaryWithBonus());
    }
}

class Salary
{
    private double fixedSalary, totalSales;

    public void setFixedSalary(double fixedSalary)
    {
        this.fixedSalary = fixedSalary;
    }

    public void setTotalSales(double totalSales)
    {
        this.totalSales = totalSales;
    }

    public double salaryWithBonus()
    {
        int commission = 15;

        return fixedSalary + ((totalSales / 100) * commission);
    }
}
