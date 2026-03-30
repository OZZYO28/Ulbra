package Tarefa7;

import java.util.Scanner;

public class SalaVip
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sua idade: ");
        int idade = scan.nextInt();

        System.out.print("Tem dinheiro para a sala vip? [y/n] ");
        char resposta = scan.next().charAt(0);
        boolean temDinheiro = (resposta == 'y' || resposta == 'Y');

        scan.close();

        if (idade >= 18 && temDinheiro)
        {
            System.out.println("Pode entrar na sala VIP");
        } else
        {
            System.out.println("Apenas sala comum");
        }
    }
}
