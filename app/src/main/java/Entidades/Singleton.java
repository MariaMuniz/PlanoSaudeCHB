package Entidades;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by alexs on 27/01/2018.
 */

public class Singleton {
    private static Singleton instance;
    public int idPlano = -1;
    public int idOperadora = -1;
    public int idProduto = -1;
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

    public void escolheIdApartamentoOuIdEnfermaria(Context context,int idEnfermaria,int idApartamento) {
        if(Singleton.getInstance().getAcomodacao().equals("Enfermaria"))
        {
            Singleton.getInstance().setIdProduto(idEnfermaria);
        }
        else if(Singleton.getInstance().getAcomodacao().equals("Apartamento"))
        {
            Singleton.getInstance().setIdProduto(idApartamento);
        }
        else{
            toastMeu(context);
            return;
        }
    }
    public void toastMeu(Context context)
    {
        Toast.makeText(context,"Erro : tem que setar singleton Apartamento ou Enfermaria",Toast.LENGTH_LONG);
    }
    public void escolheIdCooparticipacaoOuIdNormal(Context context,int idEnfermaria,int idApartamento) {
        if(Singleton.getInstance().isCooparticipacao())
        {
            Singleton.getInstance().setIdProduto(idEnfermaria);
        }
        else
        {
            Singleton.getInstance().setIdProduto(idEnfermaria);
        }
        boolean erro = false;
        if(erro){
            toastMeu2(context);
            return;
        }
    }
    public void toastMeu2(Context context)
    {
        Toast.makeText(context,"Erro : tem que setar cooparticapacao",Toast.LENGTH_LONG);
    }
}
