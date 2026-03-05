using static System.Console;
using static System.Convert;

//imagino que não deve estar igual ao que vc espera sor, mas acho mais legal a gente conversar em aula pra te explicar oq eu fiz kkkkkkk;
//gostaria de umas dicas também;

namespace CalculadoraSimples {
    class Program {
        static void Main(string[] args) {
            Clear();

            double numero1, numero2;
            string operacao;
            
            WriteLine("=== CALCULADORA SIMPLES ===");

            Write("\nDigite o primeiro número: ");
            numero1 = ToDouble(ReadLine());
            
            Write("Digite a operação (+, -, *, /): ");
            operacao = ReadLine();
            
            Write("Digite o segundo número: ");
            numero2 = ToDouble(ReadLine());
            
            if (operacao == "+") {
                WriteLine("\nResultado: " + numero1 + " + " + numero2 + " = " + (numero1+numero2));
            }
            else if (operacao == "-") {
                WriteLine("\nResultado: " + numero1 + " - " + numero2 + " = " + (numero1+numero2));
            }
            else if (operacao == "*") {
                WriteLine("\nResultado: " + numero1 + " * " + numero2 + " = " + (numero1+numero2));
            }
            else if (operacao == "/") {
                if (numero2 != 0) {
                    WriteLine("\nResultado: " + numero1 + " / " + numero2 + " = " + (numero1+numero2));
                }
                else {
                    WriteLine("\nERRO: Não é possível dividir por zero!");
                }
            }
            else {
                WriteLine("\nERRO: Operação inválida! Use +, -, * ou /");
            }
            WriteLine("\nPressione qualquer tecla para sair...");
            ReadKey();
        } } }