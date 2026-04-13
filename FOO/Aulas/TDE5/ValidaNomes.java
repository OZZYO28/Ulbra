package TDE5;

import java.util.ArrayList;

public class ValidaNomes
{
    public static boolean apenasLetrasRobusto(String string)
    {
        return string != null && !string.isEmpty() && string.chars().allMatch(Character::isLetter);
    }

    public static boolean apenasNumeros(String entrada)
    {
        return entrada != null && entrada.matches("\\d+");
    }

    public static boolean umCaractereLetra(String s)
    {
        return s != null && s.length() == 1 && Character.isLetter(s.charAt(0));
    }

    public boolean validaNomeExemplo(String nome)
    {
        if (nome == null)
        {
            return false;
        }

        String nomeSemEspaco = nome.replace(" ", "");

        return apenasLetrasRobusto(nomeSemEspaco);
    }

    void main()
    {
        ArrayList<String> listaNomes = new ArrayList<>();
        boolean continua = true;
        do
        {
            String nome = IO.readln("Digite o nome para inserir na lista: ");

            if(validaNomeExemplo(nome))
            {
                listaNomes.add(nome);
                IO.println("Nome adicionado com sucesso!");
            }
            else
            {
                IO.println("Desculpe, esse nome nao é valido");
            }

            String tecla = IO.readln("Digite 1 para continuar ou qualquer outro caracter para sair: ");
            if(!tecla.equals("1"))
            {
                continua = false;
            }

        } while (continua);
    }
}