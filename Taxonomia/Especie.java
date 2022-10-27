package com.kaisercohen.taxonomia;

/* @author Cesar Oliveira Cohen*/



public class Especie extends Reino {
    
    protected Especie(String desc){
        super(desc);
    }

    protected void obtainDescription(){
        System.out.println("Espécie: " + description);
    }
}