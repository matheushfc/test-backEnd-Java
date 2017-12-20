package br.com.matheus.cadastrojogadores;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;

    @XmlRootElement(name="liga_da_justica")
    @XmlAccessorType(XmlAccessType.FIELD)
    public class LigadaJustica implements Referencia {

        private String grupo = "Liga da Justiça";

        @XmlElementWrapper(name="codinomes")
        @XmlElement(name="codinome")
        private List<String> codinomes;


        public List<String> getCodinomes() {
            return codinomes;
        }

        private List<String> codinomesReferencia = new ArrayList<>();

        public List<String> getCodinomesReferencia() {
            return codinomesReferencia;
        }

        public void setCodinomesReferencia(List<String> codinomesReferencia) {
            this.codinomesReferencia = codinomesReferencia;
        }

        public String getGrupo() {
            return grupo;
        }


}
