/* @author Cesar Oliveira Cohen*/



public class Taxonomia {

    public static void main(String args[]){

        // - Criando novos objetos de Seres Vivos
        SerVivo homo = new SerVivo("Homem", "Animalia", "Chordata", "Mammalia",
        "Primata", "Hominidae", "Homo", "sapiens");

        SerVivo cao = new SerVivo("Cão", "Animalia", "Chordata", "Mammalia",
        "Carnívora", "Canidae", "Canis", "familiaris");

        SerVivo mosca = new SerVivo("Mosca", "Animalia", "Arthropoda",
        "Insecta", "Díptera", "Muscidae", "Musca", "domestica");

        // - Criando uma instância das informações da Cadeia dos Seres Vivos
        CadeiaDescription serVivo = new CadeiaDescription();

        // - Chamando a taxonomia completa dos Seres Vivos
        serVivo.obtainAllDescriptions(homo);
        serVivo.obtainAllDescriptions(cao);
        serVivo.obtainAllDescriptions(mosca);
    }
}