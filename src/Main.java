public class Main {
    public static void main(String[] args) {

        int[] arrInt = { 25, 65, 45, 78, 79, 99, 35 };

        String[] arrString = { "Hello", "World", "Ciao", "Cosa", "fai" };
        int checkString = 4;

        Docente docente1 = new Docente("g", "zeta", 001, 25);
        Docente docente2 = new Docente("a", "ypsilon", 002, 26);
        Docente docente3 = new Docente("b", "teta", 003, 45);
        Docente docente4 = new Docente("c", "beta", 004, 40);

        Docente[] listaDocenti = { docente1, docente2, docente3, docente4 };
        Universita universita = new Universita(listaDocenti);
        
        universita.etaMinimaDoc(listaDocenti);

        metodoMaxMin(arrInt);

        metodoSommaPari(arrInt);
        
        metodoCheckString(arrString, checkString);
    }

    public static void metodoCheckString(String[] arrStrings, int checkString) {
        boolean check = false;

        for (int i = 0; i < arrStrings.length; i++) {
            if (arrStrings[i].length() == checkString) {
                check = true;
            }
        }
        System.out.println("La ricerca è andata a buon fine ? " + check);
    }

    public static void metodoSommaPari(int[] arrInt) {
        int sommaPari = 0;

        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 == 0) {
                sommaPari += arrInt[i];
            }
        }
        System.out.println("La somma dei numeri pari è : " + sommaPari);
    }

    public static void metodoMaxMin(int[] arrInt) {
        int max = arrInt[0];
        int min = arrInt[0];
        for (int i = 1; i < arrInt.length; i++) {
            if (arrInt[i] < min) {
                min = arrInt[i];
            }
            if (arrInt[i] > max) {
                max = arrInt[i];
            }
        }
        System.out.println("\n Il min dei valori dell'array è : " + min);
        System.out.println("\n Il max dei valori dell'array è : " + max);
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