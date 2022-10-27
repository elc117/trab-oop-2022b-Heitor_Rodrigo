package com.kaisercohen.taxonomia;

/* @author Cesar Oliveira Cohen*/



public class Genero extends Reino {
    
    protected Genero(String desc){
        super(desc);
    }

    protected void obtainDescription(){
        System.out.println("Gênero: " + description);
    }
}