package Tarefa14;

public class Assentos3
{
    public static void main(String[] args)
    {
        boolean[] assentos = new boolean[10];
        menu(assentos);
    }

    public static void menu(boolean[] variavel)
    {
        System.out.println("==== MENU ====");

        int livres, ocupados = 0;

        for (int i=0; i < variavel.length; i++)
        {
            String situacao = variavel[i] ? "OCUPADO" : "VAZIO";
            System.out.printf("Assento %d: %s%n", i, situacao);

            if (variavel[i]) ocupados++;
        }
        livres = 10 - ocupados;
        System.out.printf("Livres %d | Ocupados %d%n", livres, ocupados);
    }
}
