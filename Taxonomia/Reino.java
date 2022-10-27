
/* @author Cesar Oliveira Cohen*/



public class Reino extends ClasseTaxonomica {
    
    

    // - Construtor da superclasse Reino
    protected Reino(String desc){
        description = desc;
    }

    // - Obtendo a descrição do Reino. Polimorfismo.
    protected void obtainDescription(){
        System.out.println("Reino: " + description);
    }
}