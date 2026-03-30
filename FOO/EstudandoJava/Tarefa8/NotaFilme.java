package Tarefa8;

import java.util.Scanner;

public class NotaFilme
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Dê uma nota ao filme (A-F): ");
        char nota = scan.next().charAt(0);
        char notaMaiuscula = Character.toUpperCase(nota);

        switch (notaMaiuscula)
        {
            case 'A':
                System.out.println("Excelente");
                break;

            case 'B':
                System.out.println("Bom");
                break;

            case 'C':
                System.out.println("Regular");
                break;

            case 'D':
                System.out.println("Ruim");
                break;

            case 'E':
                System.out.println("Muito Ruim");
                break;
            case 'F':
                System.out.println("Horrivel");
                break;
            default:
                System.out.println("Não é uma nota válida!");
        }
    }
}
