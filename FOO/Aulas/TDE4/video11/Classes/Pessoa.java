package TDE4.video11.Classes;

import TDE4.video11.Interfaces.EntityInterface;

public class Pessoa implements EntityInterface
{
    String nome;
    int idade;

    @Override
    public void save()
    {
        IO.println("Salvando o objeto");
    }
}
