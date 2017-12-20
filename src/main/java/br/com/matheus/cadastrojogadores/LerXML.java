package br.com.matheus.cadastrojogadores;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.net.URL;

public class LerXML implements LerArquivo{

    @Override
    public Referencia lerArquivo() throws Exception{
        URL facultyURL = new URL("https://raw.githubusercontent.com/uolhost/test-backEnd-Java/master/referencias/liga_da_justica.xml");
        InputStream xmlFile = facultyURL.openStream();

        JAXBContext jc = JAXBContext.newInstance(LigadaJustica.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        LigadaJustica ligadaJustica = (LigadaJustica) unmarshaller.unmarshal(xmlFile);
        for (int i = 0; i < ligadaJustica.getCodinomes().size(); i++) {
        }

        Referencia referenciaLiga = ligadaJustica;
        referenciaLiga.setCodinomesReferencia(ligadaJustica.getCodinomes());

        return referenciaLiga;
    }
}
