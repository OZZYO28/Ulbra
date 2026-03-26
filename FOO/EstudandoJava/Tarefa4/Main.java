package Tarefa4;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o seu nome? ");
        String nome = scanner.nextLine();

        System.out.print("Quantos anos vc tem? ");
        int idade = scanner.nextInt();

        scanner.close();

        System.out.println("Olá " + nome + ", que legal! Você tem " + idade + " anos!");
    }
}
