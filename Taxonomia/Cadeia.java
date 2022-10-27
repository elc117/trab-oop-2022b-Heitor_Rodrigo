
/* @author Cesar Oliveira Cohen*/



abstract class Cadeia {
    
    protected Reino reino;
    protected Filo filo;
    protected Classe classe;
    protected Ordem ordem;
    protected Familia familia;
    protected Genero genero;
    protected Especie especie;

    // - Construtor da Cadeia
    public Cadeia(String reino, String filo, String classe,
    String ordem, String familia, String genero, String especie){

        this.reino = new Reino(reino);
        this.filo = new Filo(filo);
        this.classe = new Classe(classe);
        this.ordem = new Ordem(ordem);
        this.familia = new Familia(familia);
        this.genero = new Genero(genero);
        this.especie = new Especie(especie);
    }
}