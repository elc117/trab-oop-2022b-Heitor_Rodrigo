
/* @author Cesar Oliveira Cohen*/



public class Ordem extends Reino {
    
    protected Ordem(String desc){
        super(desc);
    }
    
    protected void obtainDescription(){
        System.out.println("Ordem: " + description);
    }
}