package TDE7.Classes;

public class Imovel
{
    private float valor;

    private int quantiaDormitorios;

    private String descricao;

    public Imovel() {
    }

    public Imovel(float valor, int quantiaDormitorios, String descricao) {
        this.valor = valor;
        this.quantiaDormitorios = quantiaDormitorios;
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantiaDormitorios() {
        return quantiaDormitorios;
    }

    public void setQuantiaDormitorios(int quantiaDormitorios) {
        this.quantiaDormitorios = quantiaDormitorios;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "valor=" + valor +
                ", quantiaDormitorios=" + quantiaDormitorios +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
