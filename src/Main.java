public class Main {
    public static void main(String[] args) {

        int[] arr = { 45, 78, 85, 33, 75, 99, 41 };
        String[] arrStrings = { "ciao", "caro", "come", "stai" };
        int checkString = 4;

        Docente docente1= new Docente("g", "zeta", 001, 25);
        Docente docente2= new Docente("a", "ypsilon", 002, 26);
        Docente docente3= new Docente("b", "teta", 003, 45);
        Docente docente4= new Docente("c", "beta", 004, 40);

        Docente[] listaDocenti = {docente1, docente2, docente3, docente4};

        Universita universita = new Universita(listaDocenti);

        System.out.println("L'età minima della lista docenti è : " + universita.etaMin());


        metodoMaxMin(arr);
        metodoSommaPari(arr);
        metodoCheckStrings(arrStrings, checkString);
    }

    public static void metodoCheckStrings(String[] arrStrings, int checkString){
        boolean check = false;
        for(int i = 0; i<arrStrings.length;i++){
            if(arrStrings[i].length()== checkString){
                check = true;
            }
        }
        System.out.println("Il check è positivo ? : " + check);

    }

    public static void metodoSommaPari(int[] arr) {
        int sommaP = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sommaP += arr[i];
            }
        }
        System.out.println("La somma dei numeri pari dell'array è : " + sommaP);
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
        System.out.println("\n il max dell'array è : " + max + "\n il minimo dell'array è : " + min);
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