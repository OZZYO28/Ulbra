package TDE7.Classes;

import java.util.ArrayList;

public class Condominio
{
    private String nome;

    private String descricao;

    private int anoLocamento;

    private ArrayList<Imovel> imoveis = new ArrayList<>();

    public Condominio() {
    }

    public Condominio(String nome, String descricao, int anoLocamento) {
        this.nome = nome;
        this.descricao = descricao;
        this.anoLocamento = anoLocamento;
    }

    public Condominio(String nome, String descricao, int anoLocamento, ArrayList<Imovel> imoveis) {
        this.nome = nome;
        this.descricao = descricao;
        this.anoLocamento = anoLocamento;
        this.imoveis = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAnoLocamento() {
        return anoLocamento;
    }

    public void setAnoLocamento(int anoLocamento) {
        this.anoLocamento = anoLocamento;
    }

    public ArrayList<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(ArrayList<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    @Override
    public String toString() {
        return "Condominio{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", anoLocamento=" + anoLocamento +
                ", imoveis=" + imoveis +
                '}';
    }

    public void Listimovel()
    {

    }
}
