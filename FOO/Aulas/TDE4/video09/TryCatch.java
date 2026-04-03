void main()
{
    try
    {
        SimulaErro();
    }
    catch (Throwable erro)
    {
        IO.println("Achei o erro, olha só: "+erro.getMessage());
        erro.printStackTrace();
    }
}

void SimulaErro() throws Throwable
{
    throw new Throwable("sou um erro");
}