package beginner.ex1008;

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
        salary.setId(input.nextInt());
        salary.setWorkingHours(input.nextInt());
        salary.setHourlyRate(input.nextDouble());
    }

    public void print()
    {
        System.out.printf("NUMBER = %d%n", salary.getId());
        System.out.printf("SALARY = U$ %.2f%n", salary.salaryCalculated());
    }
}

class Salary
{
    private int id, workingHours;
    private double hourlyRate;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setWorkingHours(int workingHours)
    {
        this.workingHours = workingHours;
    }

    public void setHourlyRate(double hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }

    public double salaryCalculated()
    {
        return workingHours * hourlyRate;
    }
}