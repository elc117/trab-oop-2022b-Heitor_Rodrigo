public class ClasseTaxonomica {

    // - Descrição é passada por herança as suas subclasses
    public String description;

    public void setDescription(String desc){
        description = desc;
    }

    protected String getDescription(){
        return description;
    }
}
