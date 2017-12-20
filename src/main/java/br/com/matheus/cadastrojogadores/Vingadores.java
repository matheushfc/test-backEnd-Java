package br.com.matheus.cadastrojogadores;



import java.util.ArrayList;
import java.util.List;

public class Vingadores implements Referencia{

    public String getGrupo() {
        return grupo;
    }

    private String grupo = "Vingadores";

    private String codinome;

    public List<String> getCodinomesReferencia() {
        return codinomesReferencia;
    }

    public void setCodinomesReferencia(List<String> codinomesReferencia) {
        this.codinomesReferencia = codinomesReferencia;
    }

    private List<String> codinomesReferencia = new ArrayList<>();

    public void setCodinome(String codinome) {
        this.codinome = codinome;
    }
    public String getCodinome() {
        return codinome;
    }

    private List<Vingadores> vingadores;
    public void setVingadores(List<Vingadores> vingadores) {
        this.vingadores = vingadores;
    }
    public List<Vingadores> getVingadores() {
        return vingadores;
    }

    Vingadores(){

    }

}
