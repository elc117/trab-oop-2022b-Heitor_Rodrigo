
/* @author Cesar Oliveira Cohen*/



public class Familia extends Ordem {
    
    protected Familia(String desc){
        super(desc);
    }

    protected void obtainDescription(){
        System.out.println("Família: " + description);
    }
}