import AP1.Classes.Bateria;
import AP1.Classes.Celular;

void main()
{
    Bateria bateria1 = new Bateria(3000, 60);
    Celular celular1 = new Celular("Samsung", "S26 Ultra", bateria1);
    celular1.usar(70);
    celular1.carregar();
}
