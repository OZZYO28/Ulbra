package TDE7.Classes;

public class ServiceImovel
{
    public void menu(Condominio condominio)
    {
        int opc = 0;
        do {
            IO.println("---- SEJA BEM VINDO ----");
            IO.println("Selecione uma opção abaixo:");
            IO.println("1 - Adicionar");
            IO.println("2 - Editar");
            IO.println("3 - Remover");
            IO.println("4 - Listar");
            IO.println("0 - Voltar ao menu principal");
            opc = Integer.parseInt((IO.readln("Opção: ")));

            switch (opc)
            {
                case 1:
                    this.add();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
            }

        }while (opc != 0);
    }

    public void add()
    {

    }
}
