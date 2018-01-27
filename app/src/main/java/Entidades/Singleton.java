package Entidades;

/**
 * Created by alexs on 27/01/2018.
 */

public class Singleton {
    private static Singleton instance;
    public int idPlano = 1;
    public int idOperadora = 1;
    public int idProduto = 1;
    public String acomodacao = "Apartamento";
    public boolean cooparticipacao=false;

    public Singleton(){

    }

    public static Singleton getInstance()
    {
        if(instance==null)
            instance = new Singleton();

        return instance;
    }

    public int getIdPlano() {
        return idPlano;
    }

    public void setIdPlano(int idPlano) {
        this.idPlano = idPlano;
    }

    public int getIdOperadora() {
        return idOperadora;
    }

    public void setIdOperadora(int idOperadora) {
        this.idOperadora = idOperadora;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getAcomodacao() {
        return acomodacao;
    }

    public void setAcomodacao(String acomodacao) {
        this.acomodacao = acomodacao;
    }

    public boolean isCooparticipacao() {
        return cooparticipacao;
    }

    public void setCooparticipacao(boolean cooparticipacao) {
        this.cooparticipacao = cooparticipacao;
    }
}
