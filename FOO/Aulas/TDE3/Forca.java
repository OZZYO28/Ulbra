void main()
{
    String palavra = IO.readln("Digite uma palavra: ");

    char[] letras = palavra.toCharArray();
    char[] palavraAtual = new char[letras.length];

    for (int i = 0; i < letras.length; i++)
    {
        palavraAtual[i] = '_';
    }

    boolean acertouTodas = false;

    do
    {
        String linhaMostrada = "";
        for (char c : palavraAtual)
        {
            linhaMostrada += c + " ";
        }
        IO.println("Palavra: " + linhaMostrada);

        String letraDigitadaStr = IO.readln("Informe uma letra: ");
        char letra = letraDigitadaStr.charAt(0);

        boolean acertouPeloMenosUma = false;
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == letra && palavraAtual[i] == '_')
            {
                palavraAtual[i] = letra;
                acertouPeloMenosUma = true;
            }
        }

        acertouTodas = true;
        for (char c : palavraAtual)
        {
            if (c == '_')
            {
                acertouTodas = false;
                break;
            }
        }
        if (!acertouPeloMenosUma)
        {
            IO.println("Letra não encontrada.");
        }
    } while (!acertouTodas);

    IO.println("Parabéns! A palavra era: " + palavra);
}