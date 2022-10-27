package com.kaisercohen.taxonomia;

/* @author Cesar Oliveira Cohen*/



public class Familia extends Reino {
    
    protected Familia(String desc){
        super(desc);
    }

    protected void obtainDescription(){
        System.out.println("Família: " + description);
    }
}