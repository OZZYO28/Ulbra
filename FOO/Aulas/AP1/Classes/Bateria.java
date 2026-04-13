package AP1.Classes;

public class Bateria
{
    private int capacidadeMah;
    private int porcentagemAtual;

    public Bateria()
    {
        this.porcentagemAtual = 60;
    }

    public Bateria(int capacidadeMah, int porcentagemAtual)
    {
        this.capacidadeMah = capacidadeMah;
        this.porcentagemAtual = porcentagemAtual;
    }

    public int getCapacidadeMah() {
        return capacidadeMah;
    }

    public void setCapacidadeMah(int capacidadeMah) {
        this.capacidadeMah = capacidadeMah;
    }

    public int getPorcentagemAtual() {
        return porcentagemAtual;
    }

    public void setPorcentagemAtual(int porcentagemAtual) {
        this.porcentagemAtual = porcentagemAtual;
    }

    public void gastarBateria(int consumo)
    {
        if (consumo < 0)
        {
            IO.println("Não houve consumo!");
        }
        else if (consumo > 100)
        {
            IO.println("Totalmente Carregado");
        }
        else
        {
            this.porcentagemAtual -= consumo;
            if (this.porcentagemAtual < 0)
            {
                this.porcentagemAtual = 0;
                IO.println("Celular descarregou");
            }
        }

    }

    public void carregarBateria()
    {
        this.porcentagemAtual = 100;
        IO.println("Bateria carregada");
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "capacidadeMah=" + capacidadeMah +
                ", porcentagemAtual=" + porcentagemAtual +
                '}';
    }
}
