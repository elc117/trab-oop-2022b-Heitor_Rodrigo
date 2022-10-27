package com.kaisercohen.taxonomia;

/* @author Cesar Oliveira Cohen*/



public class CadeiaDescription {

    // - Chamando a taxonomia completa dos Seres Vivos
    public void obtainAllDescriptions(SerVivo serVivo){

        serVivo.obtainName();
        serVivo.reino.obtainDescription();
        serVivo.filo.obtainDescription();
        serVivo.classe.obtainDescription();
        serVivo.ordem.obtainDescription();
        serVivo.familia.obtainDescription();
        serVivo.genero.obtainDescription();
        serVivo.especie.obtainDescription();
    }
}