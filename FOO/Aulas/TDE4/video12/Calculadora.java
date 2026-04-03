import TDE4.video12.Enum.Operacao;

void main()
{
    Double numero1 = Double.parseDouble(IO.readln("Digite o primeiro numero: "));
    Double numero2 = Double.parseDouble(IO.readln("Digite o segundo numero: "));
    short operacao = Short.parseShort(IO.readln("1- Soma\n2- subtração\n3- Multiplicação\n4- Divisão\nDigite a operação desejada: "));

    operacao--;
    double resultado = 0.0;
    if (operacao == Operacao.SOMA.ordinal())
    {
        resultado = numero1 + numero2;
    }
    else if (operacao == Operacao.subtracao.ordinal())
    {
        resultado = numero1 - numero2;
    }
    else if (operacao == Operacao.multiplicacao.ordinal())
    {
        resultado = numero1 * numero2;
    }
    else if (operacao == Operacao.divisao.ordinal())
    {
        resultado = numero1 * numero2;
    }

    IO.println(String.format("O resultado do calculo é: %s", resultado));
}