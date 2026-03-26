using static System.Console; 
using static System.Convert;

do
{
    Clear();
    WriteLine("=== CALCULADORA SIMPLES ===");

    Write("\nDigite o primeiro número: ");
    double numero1 = ToDouble(ReadLine());

    Write("Digite a operação (+, -, *, /): ");
    char operacao = ReadKey().KeyChar;

    Write("\nDigite o segundo número: ");
    double numero2 = ToDouble(ReadLine());

    if (operacao == '+') {
        WriteLine($"\nResultado: {numero1} + {numero2} = {numero1+numero2}");
    }
    else if (operacao == '-') {
        WriteLine($"\nResultado: {numero1} - {numero2} = {numero1-numero2}");
    }
    else if (operacao == '*') {
        WriteLine($"\nResultado: {numero1} * {numero2} = {numero1*numero2}");
    }
    else if (operacao == '/') {
        if (numero2 != 0) {
            WriteLine($"\nResultado: {numero1} / {numero2} = {numero1/numero2}");
        }
        else {
            WriteLine("\nERRO: Não é possível dividir por zero!");
        }
    }
    else {
        WriteLine("\nERRO: Operação inválida! Use +, -, * ou /");
    }
    WriteLine("\nPressione qualquer tecla para calcular novamente (1 - Saída).");
} while (ReadKey(true).KeyChar != '1');