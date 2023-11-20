public class Docente{
    private String nome;
    private String cognome;
    private int codice;
    private int eta;


    public Docente(String nome, String cognome, int codice, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.eta = eta;
    }


    public String getNome() {
        return nome;
    }


    public String getCognome() {
        return cognome;
    }


    public int getCodice() {
        return codice;
    }


    public int getEta() {
        return eta;
    }

    

    
    
}
/* 
 * Scrivere una classe Docente che rappresenti le seguenti informazioni relative
 * ad un docente: nome, cognome, codice ed età.
 * 
 * La classe dovrà avere un costruttore ed i metodi accessori.
 *  */