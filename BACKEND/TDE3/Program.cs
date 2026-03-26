using static System.Convert; using static System.Console;

int op = 0;
decimal saldo = 1000.0m;
decimal retirada = 0.0m;

do
{
    Clear();
    WriteLine("1 - Ver saldo\n2 - Depositar\n3 - Sacar\n4 - Ultimo saque\n5 - Sair");
    op = ReadKey(true).KeyChar - '0';

    switch(op)
    {
        case 1:
        WriteLine($"Seu saldo atual é de: {saldo}R$");
        ReadKey();
        break;

        case 2:
        WriteLine($"Seu saldo atual é de: {saldo}R$");
        Write("Quanto deseja adicionar? ");
        saldo += ToDecimal(ReadLine());
        WriteLine($"Seu saldo atual é de: {saldo}R$");
        ReadKey();
        break;
    
        case 3:
        WriteLine($"Seu saldo atual é de: {saldo}R$");
        Write("Quanto deseja remover? ");
        retirada = ToDecimal(ReadLine());
        if ((saldo - retirada) < 0) 
        {
            WriteLine("Saldo insuficiente!");
            continue;
        }
        else 
        {
            saldo -= retirada;
            WriteLine($"Seu saldo atual é de: {saldo}R$");
            ReadKey();
            break;
        }
        case 4:
        WriteLine($"Seu ultimo saque foi no valor de: {retirada}R$");
        ReadKey();
        break;

        default: 
        if (op is not 5) { WriteLine("Opção invalida! Somente valores de 1 até 5"); }
        break;
    }
} while (op != 5);