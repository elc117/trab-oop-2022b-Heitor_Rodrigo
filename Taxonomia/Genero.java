
/* @author Cesar Oliveira Cohen*/



public class Genero extends Familia {
    
    protected Genero(String desc){
        super(desc);
    }

    protected void obtainDescription(){
        System.out.println("Gênero: " + description);
    }
}