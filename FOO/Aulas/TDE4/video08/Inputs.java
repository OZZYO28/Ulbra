void main()
{
    String nome = IO.readln("Qual o seu nome? ");
    int idade = Integer.parseInt(IO.readln("Qual sua idade? "));
    double peso = Double.parseDouble(IO.readln("Qual seu peso? "));

    IO.println("Olá "+nome);
    IO.println("Sua idade é: "+idade);
    IO.println("Você pesa: "+peso);
}