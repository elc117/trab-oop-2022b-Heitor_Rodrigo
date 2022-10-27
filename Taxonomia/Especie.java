
/* @author Cesar Oliveira Cohen*/



public class Especie extends Genero {
    
    protected Especie(String desc){
        super(desc);
    }

    protected void obtainDescription(){
        System.out.println("Espécie: " + description);
    }
}