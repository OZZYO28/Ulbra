package Tarefa12;

public class Assentos
{
    public static void main(String[] args)
    {
        boolean[] assentos = new boolean[10];
        byte livres = 10;
        byte ocupados = 0;

        for (int i = 0; i < assentos.length; i++)
        {
            assentos[i] = false;

            if (!assentos[1])
            {
                System.out.printf("Assento %d: VAZIO%n", i);
            } else {
                System.out.printf("Assento %d: OCUPADO%n", i);
                ocupados++;
            }
        }
        System.out.println("Total de assentos: 10");
        System.out.printf("assentos livres: %d%n", (livres - ocupados));
        System.out.printf("assentos ocupados: %d%n", ocupados);
    }

}
