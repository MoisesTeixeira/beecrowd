package ex1000;

public class Main
{
    public static void main(String[] args)
    {
        TextInterface textInterface = new TextInterface("Hello World!");

        textInterface.print();
    }
}

class TextInterface
{
    private String message;

    public TextInterface(String message)
    {
        this.message = message;
    }

    public void print()
    {
        System.out.println(message);
    }
}