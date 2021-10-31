package ex1000;

public class Main
{
    public static void main(String[] args)
    {
        InterfaceTexto dados = new InterfaceTexto();

        dados.print("Hello World!");
    }
}

class InterfaceTexto
{
    private Mensagem imprimir;

    public InterfaceTexto()
    {
        imprimir = new Mensagem();
    }

    public void print(String input)
    {
        imprimir.setMensagem(input);
        System.out.println(imprimir.getMensagem());
    }
}

class Mensagem
{
    private String mensagem;

    public String getMensagem()
    {
        return mensagem;
    }

    public void setMensagem(String mensagem)
    {
        this.mensagem = mensagem;
    }
}