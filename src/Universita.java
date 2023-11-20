public class Universita {

    private static Docente[] listaDocenti;

    public Universita(Docente[] listaDocenti) {
        Universita.listaDocenti = listaDocenti;
    }

    public static Docente[] getListaDocenti() {
        return listaDocenti;
    }

    public static int etaMin(){
        int etaMin = listaDocenti[0].getEta();

        for(int i = 1; i<listaDocenti.length; i++){

            if(listaDocenti[i].getEta() < etaMin){

                etaMin = listaDocenti[i].getEta();
            }
        }

        return etaMin;
    }
}

/*
 * * Scrivere poi una classe Università che rappresenti un insieme di docenti
 * universitari tramite un Array di tipo Docente e che contenga il costruttore,
 * i metodi accessori ed un metodo che restituisce l’età minima tra i docenti
 * universitari.
 */