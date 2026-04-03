void main()
{
    int idade = 3;
    String nome = "Ozio";

    if ((nome == "Ozio") && (idade == 19))
    {
        IO.println("Olá Ozio");
    }
    else if (idade >= 18)
    {
        IO.println("Você é maior de idade");
    }
    else if (idade <= 3)
    {
        IO.println("Você é um bebe");
    } else
    {
        IO.println("Você é menor de idade");
    }
}