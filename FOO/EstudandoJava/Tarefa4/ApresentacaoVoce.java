package Tarefa4;

import java.util.Scanner;

public class ApresentacaoVoce
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o seu nome? ");
        String nome = scan.nextLine();

        System.out.print("Quantos anos vc tem? ");
        int idade = scan.nextInt();

        scan.close();

        System.out.println("Olá " + nome + ", que legal! Você tem " + idade + " anos!");
    }
}
