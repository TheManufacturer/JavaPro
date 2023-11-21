public class Studente {
    private String nome;
    private String cognome;
    private int matricola;
    private int voto;


    @Override
    public String toString() {
        return "Studente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + ", voto=" + voto + "]";
    }


    public Studente(String nome, String cognome, int matricola, int voto) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.voto = voto;
    }


    public String getNome() {
        return nome;
    }


    public String getCognome() {
        return cognome;
    }


    public int getMatricola() {
        return matricola;
    }


    public int getVoto() {
        return voto;
    }
}



/*
 * Classe Studente:
 * 
 * Crea una classe Studente con le seguenti informazioni: nome, cognome,
 * matricola, e voto.
 * Implementa il costruttore e i metodi accessori per la classe.
 */