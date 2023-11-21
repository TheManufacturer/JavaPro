
public class Main {
    public static void main(String[] args) {

        Studente studente1 = new Studente("Antonio", "De Mario", 001, 10);
        Studente studente2 = new Studente("Giovanni", "De bienchi", 002, 5);
        Studente studente3 = new Studente("Franco", "De niero", 003, 8);
        Studente studente4 = new Studente("Frankie", "De giove", 004, 9);

        Studente[] listaStudenti = { studente1, studente2, studente3, studente4 };
        Corso corso1 = new Corso(listaStudenti);
        
        System.out.println("La media del corso 1 : " + corso1.metodoMediaStudenti(listaStudenti));

        //corso1.metodoStudentiSuper(listaStudenti, 8);
     }
}

/*
 * Classe Studente:
 * 
 * Crea una classe Studente con le seguenti informazioni: nome, cognome,
 * matricola, e voto.
 * Implementa il costruttore e i metodi accessori per la classe.
 * 
 * 
 * Classe Corso:
 * 
 * Crea una classe Corso che rappresenti un insieme di studenti tramite un array
 * di tipo Studente.
 * La classe dovrebbe avere un costruttore che accetti un array di studenti.
 * Implementa un metodo che calcoli e restituisca la media dei voti degli
 * studenti nel corso.
 * 
 * 
 * Programma Principale:
 * 
 * Nel programma principale, crea alcuni studenti e un corso contenente questi
 * studenti.
 * Stampare a video le informazioni degli studenti.
 * Calcolare e stampare a video la media dei voti nel corso.
 * 
 * 
 * --------------           NON FATTO (da completare)  ----------------------
 * Aggiungere un Metodo per Trovare Studenti con Voti Sopra una Soglia:
 * 
 * Aggiungi un metodo alla classe Corso che accetti una soglia di voto
 *  e
 * restituisca un array di studenti che hanno ottenuto un voto superiore a
 * quella soglia. 
 * 
 * Puoi chiamare questo metodo, trovaStudentiConVotoSopraSoglia(int soglia).
 * Stampa quindi a video le
 * informazioni sugli studenti restituiti nel tuo metodo main.
 * --------------------------------------------------------------------------
 * 
 */