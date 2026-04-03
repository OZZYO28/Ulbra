public class Pessoa
{
    public int Idade { get; set; }
    public string Nome { get; set; } = "";
    public string? CPF { get; set; }
    public DateTime DataNascimento { get; }

    public static void apresentar()
    {
        System.Console.WriteLine($"Meu nome é {Nome}, e eu tenho {Idade} anos");
    }
}