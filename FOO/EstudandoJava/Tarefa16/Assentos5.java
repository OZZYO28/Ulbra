package Tarefa16;

import java.util.Scanner;

public class Assentos5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean[] assentos = new boolean[10];

        int escolha;
        do
        {

            menu(assentos);
            System.out.print("1- Reservar Assentos; 2- Cancelar Assentos; 0- Sair: ");
            escolha = scan.nextInt();

            if (escolha == 1)
            {
                reservarAssentos(assentos, scan);
            }
            else if (escolha == 2)
            {
                cancelarAssentos(assentos, scan);
            }

        } while (escolha != 0);
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

    public static void reservarAssentos(boolean[] variavel, Scanner scan)
    {
        System.out.print("Qual assento deseja reservar (0-9)? ");
        int opcao = scan.nextInt();
        if (opcao >= 0 && opcao < 10)
        {
            if (!variavel[opcao]) variavel[opcao] = true;
        }
        else
        {
            System.out.println("INVÁLIDO");
        }
    }

    public static void cancelarAssentos(boolean[] variavel, Scanner scan)
    {
        System.out.print("Qual assento deseja cancelar (0-9)? ");
        int opcao = scan.nextInt();
        if (opcao >= 0 && opcao < 10)
        {
            if (variavel[opcao]) variavel[opcao] = false;
        }
        else
        {
            System.out.println("INVÁLIDO");
        }
    }
}
