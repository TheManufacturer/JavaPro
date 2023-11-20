public class Main {
    public static void main(String[] args) {

        // Array di numeri e stringhe
        int[] arr = { 15, 59, 45, 75, 64, 99, 78 };

        String[] arrStrings = { "ciao", "caro", "come", "stai" };
        
        int valCheck = 4;

        // Array di docenti
        Docente docente1 = new Docente("Francesco", "DelNuovo", 1, 26);
        Docente docente2 = new Docente("Giovanni", "Dellintermedio", 2, 26);
        Docente docente3 = new Docente("Mario", "NelFrattempo", 4, 26);
        Docente docente4 = new Docente("Antonio", "Dopo", 3, 26);
        Docente docente5 = new Docente("Simone", "Prima", 5, 26);
        
        Docente[] listaDocentiUni = { docente1, docente2, docente3, docente4, docente5 };

        // Creazione dell'oggetto Universita
        Universita universita = new Universita(listaDocentiUni);

        // Accesso alla lista di docenti dell'università
        Docente[] listaDocenti = universita.getListaDocenti();
        for (Docente docente : listaDocenti) {
            System.out.println(
                "Docente: " + docente.getNome() + " " + docente.getCognome() +
                ", Età: " + docente.getEta()
            );
        }

        // Calcolo dell'età minima tra i docenti dell'università
        Universita.etaMinDocente();

        // Altre operazioni
        metodoMaxMin(arr);
        metodoSommaPari(arr);
        metodoCheckString(arrStrings, valCheck);
    }

    public static void metodoCheckString(String[] arrStrings, int valCheck) {
        boolean checkString = false;

        for (int i = 0; i < arrStrings.length; i++) {

            if (arrStrings[i].length() == valCheck) {
                checkString = true;
            }
        }
        System.out.println("Il valore è di uguale lunghezza ? " + checkString);
    }

    public static void metodoSommaPari(int[] arr) {
        int somma = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

                somma += arr[i];
            }
        }
        System.out.println("La somma dei pari è : " + somma);
    }

    public static void metodoMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Il max della lista : " + max + "\n Il min della lista : " + min);
    }

}

/*
 * Creare un programma in Java che dato un array di interi abbia i seguenti
 * metodi:
 * 
 * 
 * a) Scrivere un metodo che a partire da un array calcoli il valore massimo e
 * il valore minimo e
 * stampi l’informazione a video.
 * 
 * 
 * b) Scrivere un metodo che calcoli la somma di tutti i numeri pari all’interno
 * dell’array e stampi l’informazione a video.
 * 
 * 
 * Creare un programma in Java che dato un array di Stringhe abbia il seguente
 * metodo:
 * 
 * c) Scrivere un metodo che ricerchi se una stringa di lunghezza definita
 * dall’utente è contenuta o meno all’iterno dell’array
 * e che restituisca true o false come risultato della ricerca. Il risultato
 * della ricerca dovrà essere stampato a video.
 * 
 * Traccia Bonus:
 * 
 * Scrivere una classe Docente che rappresenti le seguenti informazioni relative
 * ad un docente: nome, cognome, codice ed età.
 * 
 * La classe dovrà avere un costruttore ed i metodi accessori.
 * 
 * Scrivere poi una classe Università che rappresenti un insieme di docenti
 * universitari tramite un Array di tipo Docente e che contenga il costruttore,
 * i metodi accessori ed un metodo che restituisce l’età minima tra i docenti
 * universitari.
 */