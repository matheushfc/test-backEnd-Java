package br.com.matheus.cadastrojogadores;

import java.util.*;

public class BancoDados {

    static Map<String, Jogadores> tabela = new HashMap<>();

    private List<String> codinomesEscolhidosVingadores = new ArrayList<>();

    private List<String> codinomesEscolhidosLiga = new ArrayList<>();


    public static Map<String, Jogadores> getTabela() {
        return tabela;
    }

    public void setTabela(Map<String, Jogadores> tabela) {
        this.tabela = tabela;
    }

    public List<String> getCodinomesEscolhidosVingadores() {
        return codinomesEscolhidosVingadores;
    }

    public List<String> getCodinomesEscolhidosLiga() {
        return codinomesEscolhidosLiga;
    }

    public boolean insertJogador(Jogadores jogador){
        String grupoAux = jogador.getGrupo();
        tabela.put(jogador.getCodinome(), jogador);
        if(grupoAux.equals("Vingadores"))
            codinomesEscolhidosVingadores.add(jogador.getCodinome());
        else
            codinomesEscolhidosLiga.add(jogador.getCodinome());
        return true;
    }

    public String verificaDisponibilidade(Referencia referencia){
        List<String> aux = referencia.getGrupo().equals("Vingadores")?codinomesEscolhidosVingadores:codinomesEscolhidosLiga;
        for (int i = 0; i < referencia.getCodinomesReferencia().size(); i++) {
            if(!aux.contains(referencia.getCodinomesReferencia().get(i))){
                return referencia.getCodinomesReferencia().get(i);
            }
        }
        return "";
    }

    public void remover(String codinome){
        getTabela().remove(codinome);
        if(getCodinomesEscolhidosVingadores().contains(codinome)){
            getCodinomesEscolhidosVingadores().remove(codinome);
        }
        if(getCodinomesEscolhidosLiga().contains(codinome)){
            getCodinomesEscolhidosLiga().remove(codinome);
        }
    }

}