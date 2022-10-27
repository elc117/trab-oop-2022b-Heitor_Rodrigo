
/* @author Cesar Oliveira Cohen*/



public class Classe extends Reino {
    
    protected Classe(String desc){
        super(desc);
    }

    protected void obtainDescription(){
        System.out.println("Classe: " + description);
    }
}