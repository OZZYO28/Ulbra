package Tarefa10;

import java.util.Scanner;

public class TipoIngresso
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean valido;
        do {
            System.out.print("Tipo de ingresso [VIP, COMUM]: ");
            String tipo = scan.nextLine();
            String tipoUpper = tipo.toUpperCase();
            valido = (tipoUpper.equals("VIP") || tipoUpper.equals("COMUM"));

            if (!valido) {
                System.out.println("Tipo INVALIDO!");
            }
        } while (!valido);

        System.out.println("Seja bem vindo!");
        scan.close();
    }
}
