package br.com.matheus.cadastrojogadores;

import org.codehaus.jackson.map.ObjectMapper;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LerJson implements LerArquivo {

    @Override
    public Referencia lerArquivo() throws Exception{
        URL url = new URL("https://raw.githubusercontent.com/uolhost/test-backEnd-Java/master/referencias/vingadores.json");
        ObjectMapper mapper = new ObjectMapper();
        Vingadores vingadores = mapper.readValue(url, Vingadores.class);

        Referencia referenciaVingadores = vingadores;
        List<String> aux = new ArrayList<>();
        for (int i = 0; i < vingadores.getVingadores().size(); i++) {
            aux.add(vingadores.getVingadores().get(i).getCodinome());
        }
        referenciaVingadores.setCodinomesReferencia(aux);

        return referenciaVingadores;
    }
}
