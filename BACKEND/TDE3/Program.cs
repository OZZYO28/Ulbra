using System.Diagnostics.Contracts;

int op = 0;
decimal saldo = 1000.0m;
decimal retirada = 0.0m;
Console.Clear();

do
{
    Console.WriteLine("1 - Ver saldo\n2 - Depositar\n3 - sacar\n4 - Sair");
    op = Convert.ToInt32(Console.ReadLine());

    switch(op) {
        
        case 1:
        Console.Clear();
        Console.WriteLine($"Seu saldo atual é de: {saldo}R$");
        Console.ReadLine();
        Console.Clear();
        break;

        case 2:
        Console.Clear();
        Console.WriteLine($"Seu saldo atual é de: {saldo}R$");
        Console.Write("Quanto deseja adicionar? ");
        saldo += Convert.ToDecimal(Console.ReadLine());
        Console.WriteLine($"Seu saldo atual é de: {saldo}R$");
        Console.ReadLine();
        Console.Clear();
        break;
    
        case 3:
        Console.Clear();
        Console.WriteLine($"Seu saldo atual é de: {saldo}R$");
        Console.Write("Quanto deseja remover? ");
        retirada = Convert.ToDecimal(Console.ReadLine());
        if ((saldo - retirada) < 0) {

            Console.WriteLine("Saldo insuficiente!");
            Console.Clear();
            continue;
        }
        else {

            saldo -= retirada;
            Console.WriteLine($"Seu saldo atual é de: {saldo}R$");
            Console.ReadLine();
            Console.Clear();
            break;
        }

        default:
        Console.WriteLine("Opção invalida! Somente valores de 1 até 4");
        break;
    }
} while (op != 4);