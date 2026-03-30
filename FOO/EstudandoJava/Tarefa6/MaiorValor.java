package Tarefa6;

import java.util.Scanner;

public class MaiorValor
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int valor1 = scan.nextInt();

        System.out.print("Segundo valor: ");
        int valor2 = scan.nextInt();

        scan.close();

        if (valor1 > valor2)
        {
            System.out.printf("%d é o maior valor %n", valor1);
        } else if (valor2 > valor1)
        {
            System.out.printf("%d é o maior valor %n", valor2);
        } else
        {
            System.out.println("os valores são identicos %n");
        }
    }
}
