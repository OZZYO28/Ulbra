package Tarefa9;

import java.util.Scanner;

public class Bilheteria
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("===== BILHETERIA =====");

        int contador = 0;
        while (contador < 5)
        {
            System.out.printf("Pessoas: %d/5%n", contador);
            System.out.print("Digite o nome: ");
            scan.nextLine();
            contador++;
        }

        System.out.println("==== CINEMA LOTADO ====");
    }
}
