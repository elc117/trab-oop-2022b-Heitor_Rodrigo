
/* @author Cesar Oliveira Cohen*/



public class Ordem extends Classe {
    
    protected Ordem(String desc){
        super(desc);
    }
    
    protected void obtainDescription(){
        System.out.println("Ordem: " + description);
    }
}