package beginner.ex1016;

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
    private Distance distance;

    public UserInterface()
    {
        input = new Scanner(System.in);
        distance = new Distance();
    }

    public void input()
    {
        distance.setKm(input.nextInt());
    }

    public void print()
    {
        System.out.println(distance.timeOfTravel() + " minutos");
    }
}

class Distance
{
    private int km;

    public void setKm(int km)
    {
        this.km = km;
    }

    public int timeOfTravel()
    {
        return km * 2;
    }
}