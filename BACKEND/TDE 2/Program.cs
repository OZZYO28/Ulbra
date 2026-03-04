using System;

namespace CalculadoraSimples
{
    class Program
    {
        static void Main(string[] args)
        {
            double numero1, numero2, resultado;
            string operacao;
            
            Console.WriteLine("=== CALCULADORA SIMPLES ===");
            Console.WriteLine();
            
            Console.Write("Digite o primeiro número: ");
            numero1 = Convert.ToDouble(Console.ReadLine());
            
            Console.Write("Digite a operação (+, -, *, /): ");
            operacao = Console.ReadLine();
            
            Console.Write("Digite o segundo número: ");
            numero2 = Convert.ToDouble(Console.ReadLine());
            
            if (operacao == "+")
            {
                resultado = numero1 + numero2;
                Console.WriteLine();
                Console.WriteLine("Resultado: " + numero1 + " + " + numero2 + " = " + resultado);
            }
            else if (operacao == "-")
            {
                resultado = numero1 - numero2;
                Console.WriteLine();
                Console.WriteLine("Resultado: " + numero1 + " - " + numero2 + " = " + resultado);
            }
            else if (operacao == "*")
            {
                resultado = numero1 * numero2;
                Console.WriteLine();
                Console.WriteLine("Resultado: " + numero1 + " * " + numero2 + " = " + resultado);
            }
            else if (operacao == "/")
            {
                if (numero2 != 0)
                {
                    resultado = numero1 / numero2;
                    Console.WriteLine();
                    Console.WriteLine("Resultado: " + numero1 + " / " + numero2 + " = " + resultado);
                }
                else
                {
                    Console.WriteLine();
                    Console.WriteLine("ERRO: Não é possível dividir por zero!");
                }
            }
            else
            {
                Console.WriteLine();
                Console.WriteLine("ERRO: Operação inválida! Use +, -, * ou /");
            }
            
            Console.WriteLine();
            Console.WriteLine("Pressione qualquer tecla para sair...");
            Console.ReadKey();
        }
    }
}