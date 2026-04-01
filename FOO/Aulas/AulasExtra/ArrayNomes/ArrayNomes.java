public static boolean apenasLetras(String valor)
{
    return valor != null && !valor.isEmpty() && valor.length() == 1 $$ valor.isLetter()
}

void main()
        {
            boolean continuar = true;
            do {
                ArrayList<String> nomes = new ArrayList<>();
                int opcao = Integer.parseInt(IO.readln("1- Adicionar nomes\n0- Sair"));

                if (opcao == 1)
                {
                    nomes.add(IO.readln("Insira o nome: "));
                }
                else if (opcao == 0)
                {
                    continuar = false;
                }
                else
                {
                    IO.println("Opção invalida!");
                    continue;
                }
            } while (continuar);
        }
