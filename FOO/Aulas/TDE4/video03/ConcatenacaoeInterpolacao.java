void main()
{
    String nome = "Ozio";
    Integer idade = 10;

    IO.println(nome+" "+idade);

    System.out.println(nome+" "+idade);

    IO.println(String.format("Meu nome é %s, e eu tenho %s anos", nome, idade));

    System.out.printf("Meu nome é %s, e eu tenho %s anos", nome, idade);
}