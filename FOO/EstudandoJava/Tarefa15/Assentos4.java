package Tarefa15;

import java.util.Scanner;

public class Assentos4
{
    public static void main(String[] args)
    {
        boolean[] assentos = new boolean[10];
        Scanner scan = new Scanner(System.in);
        int escolha;

        do
        {
            menu(assentos);
            System.out.println("Digite assento para reservar, ou '-1' para sair: ");
            escolha = scan.nextInt();
            if (escolha >= 0 && escolha < 10)
            {
                reservarAssentos(assentos, escolha);
            }
        } while (escolha != -1);
        scan.close();
    }

    public static void menu(boolean[] variavel)
    {
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

    public static void reservarAssentos(boolean[] variavel, int posicao)
    {
        if (posicao >= 0 && posicao < 10)
        {
            if (!variavel[posicao]) variavel[posicao] = true;
        }
        else
        {
            System.out.println("INVÁLIDO");
        }
    }
}
