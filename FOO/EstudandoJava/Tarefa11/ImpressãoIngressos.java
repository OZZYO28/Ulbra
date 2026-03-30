package Tarefa11;

public class ImpressãoIngressos
{
    public static void main(String[] args)
    {
        System.out.println("=== IMPRESSÃO DE INGRESSOS ===");
        for (byte i = 1; i <= 5; i++)
        {
            System.out.printf("Ingresso #%d%n", i);
        }
            System.out.println("=== ACABARAM OS INGRESSOS ===");
    }
}