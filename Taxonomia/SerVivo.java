package com.kaisercohen.taxonomia;

/* @author Cesar Oliveira Cohen*/



public class SerVivo extends Cadeia {

    private String name;

    // - Construtor do Ser Vivo, settando seus atributos
    public SerVivo(String name, String reino, String filo, String classe,
    String ordem, String familia, String genero, String especie){

        super(reino, filo, classe, ordem, familia, genero, especie);
        this.name = name;
    }
   
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    // - Obtendo o nome do Ser Vivo
    public void obtainName(){
        System.out.println("=====> (" + name + ") <=====");
    }
}