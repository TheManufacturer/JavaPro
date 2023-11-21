public class Universita {
    Docente[] listaDocenti;

    public Universita(Docente[] listaDocenti) {
        this.listaDocenti = listaDocenti;
    }

    public void etaMinimaDoc(Docente[] listaDocenti) {
        int etaMinDoc = listaDocenti[0].getEta();
        for (int i = 0; i < listaDocenti.length; i++) {
            if (listaDocenti[i].getEta() < etaMinDoc) {
                etaMinDoc=listaDocenti[i].getEta();
            }
        }
        System.out.println("L'età più bassa è : " + etaMinDoc);

    }

}

/*
 * * Scrivere poi una classe Università che rappresenti un insieme di docenti
 * universitari tramite un Array di tipo Docente e che contenga il costruttore,
 * i metodi accessori ed un metodo che restituisce l’età minima tra i docenti
 * universitari.
 */