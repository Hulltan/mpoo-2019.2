public class Application
{
    public static void main(String[] args)
    {
        HelloWorld nome = new HelloWorld();
        HelloWorld sobrenome = new HelloWorld();
        HelloWorld apelido = new HelloWorld();
        HelloWorld semNome = new HelloWorld();
        nome.setName("Jesulen");
        sobrenome.setName("Vicente");
        apelido.setName("Len");
        nome.imprimir();
        sobrenome.imprimir();
        apelido.imprimir();
        semNome.imprimir();
    }
}
