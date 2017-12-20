package br.com.matheus.cadastrojogadores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Programa {

    static Referencia referenciaVingadores;
    static Referencia referenciaLiga;
    static BancoDados bd;

    public static Referencia getReferenciaVingadores() {
        return referenciaVingadores;
    }

    public static void setReferenciaVingadores(Referencia referenciaVingadores) {
        Programa.referenciaVingadores = referenciaVingadores;
    }

    public static Referencia getReferenciaLiga() {
        return referenciaLiga;
    }

    public static void setReferenciaLiga(Referencia referenciaLiga) {
        Programa.referenciaLiga = referenciaLiga;
    }

    public static BancoDados getBd() {
        return bd;
    }

    public static void setBd(BancoDados bd) {
        Programa.bd = bd;
    }

    public static void main(String[] args) throws Exception {

        SpringApplication.run(Programa.class, args);
        referenciaVingadores = new LerJson().lerArquivo();
        referenciaLiga = new LerXML().lerArquivo();
        bd = new BancoDados();

    }

}

