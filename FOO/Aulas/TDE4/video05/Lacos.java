void main() {
    for (int i = 0; i <= 100; i++) {
        IO.println(i);
    }

    boolean loopAtivo = true;

    int i = 0;

    do
    {
        IO.println("medanotasor");
        i++;
        if (i == 10)
        {
            loopAtivo = false;
        }
    } while (loopAtivo);

    loopAtivo = true;

    while (loopAtivo)
    {
        IO.println("medanotasor2");
        i++;
        if (i == 10)
        {
            loopAtivo = false;
        }
    }
}