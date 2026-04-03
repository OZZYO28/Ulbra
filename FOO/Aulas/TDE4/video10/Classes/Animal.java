package TDE4.video10.Classes;

public class Animal {
    private String especie;
    private String habitat;
    private int tempoMedioDeVida;


    public Animal(String especie, String habitat, int tempoMedioDeVida) {
        this.especie = especie;
        this.habitat = habitat;
        this.tempoMedioDeVida = tempoMedioDeVida;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getTempoMedioDeVida() {
        return tempoMedioDeVida;
    }

    public void setTempoMedioDeVida(int tempoMedioDeVida) {
        this.tempoMedioDeVida = tempoMedioDeVida;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", habitat='" + habitat + '\'' +
                ", tempoMedioDeVida=" + tempoMedioDeVida +
                '}';
    }
}
