package com.kaisercohen.taxonomia;

/* @author Cesar Oliveira Cohen*/



public class Reino {
    
    // - Descrição é passada por herança as suas subclasses
    protected String description;

    // - Construtor da superclasse Reino
    protected Reino(String desc){
        description = desc;
    }

    protected void setDescription(String desc){
        description = desc;
    }

    protected String getDescription(){
        return description;
    }

    // - Obtendo a descrição do Reino. Polimorfismo.
    protected void obtainDescription(){
        System.out.println("Reino: " + description);
    }
}