package TDE7.Classes;

import java.util.ArrayList;

public class ServiceCondominio
{
    private ArrayList<Condominio> condominios = new ArrayList<>();
    private ServiceImovel serviceImovel = new ServiceImovel();

    public void menu()
    {
        int opc = 0;
        do {
            IO.println("---- SEJA BEM VINDO ----");
            IO.println("Selecione uma opção abaixo:");
            IO.println("1 - Adicionar");
            IO.println("2 - Editar");
            IO.println("3 - Remover");
            IO.println("4 - Listar");
            IO.println("0 - Sair");
            opc = Integer.parseInt((IO.readln("Opção: ")));

            switch (opc)
            {
                case 1:
                    this.add();
                    break;
                case 2:
                    this.edit();
                    break;
                case 3:
                    this.remover();
                    break;
                case 4:
                    this.list();
                    break;
                case 0:
                    break;
            }

        }while (opc != 0);
    }

    public void add()
    {
        String nome = IO.readln("Nome do condominio: ");
        String descricao = IO.readln("Descrição: ");
        int anoLancamento = Integer.parseInt(IO.readln("Ano de Lançamento: "));

        Condominio condominio = new Condominio(nome, descricao, anoLancamento);
        this.serviceImovel.menu(condominio);
        this.condominios.add(condominio);
    }

    public void edit()
    {
        this.list();
        int index = Integer.parseInt(IO.readln("Digite o indice que deseja editar: "));
        this.condominios.get(index).setNome(IO.readln("Digite o novo nome: "));
        this.condominios.get(index).setDescricao(IO.readln("Digite a nova descrição: "));
        this.condominios.get(index).setAnoLocamento(Integer.parseInt(IO.readln("Digite o novo ano de lançamento: ")));
        this.serviceImovel.menu(this.condominios.get(index));

    }

    public void remover()
    {
        this.list();
        int index = Integer.parseInt(IO.readln("Digite o indice que deseja remover: "));
        this.condominios.remove(index);
    }

    public void list()
    {
        for (int i = 0; i < this.condominios.size(); i++) {
            IO.println("Indice: "+i);
            IO.println(this.condominios.get(i).toString());
        }
    }
}
