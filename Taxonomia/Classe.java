
/* @author Cesar Oliveira Cohen*/



public class Classe extends Filo {
    
    protected Classe(String desc){
        super(desc);
    }

    protected void obtainDescription(){
        System.out.println("Classe: " + description);
    }
}