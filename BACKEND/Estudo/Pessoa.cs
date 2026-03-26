class Pessoa(string? nome, int idade)
{
    public string? Nome = nome;
    public int Idade = idade;

    public void Falar() => Console.WriteLine($"Olá, meu Nome é {Nome}");

    public string VerificarIdade() => Idade < 18 ? "Menor de idade" : "Maior de idade";
}