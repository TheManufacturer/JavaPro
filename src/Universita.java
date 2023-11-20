public class Universita {
    private static Docente[] listaDocenti;

    public Universita(Docente[] listaDocenti) {
        Universita.listaDocenti = listaDocenti;
    }

    public Docente[] getListaDocenti() {
        return listaDocenti;
    }

    public static void etaMinDocente() {
        int etaMinima = listaDocenti[0].getEta();
        int segna = 0;

        for (int i = 0; i < listaDocenti.length; i++) {
            if (listaDocenti[i].getEta() < etaMinima) {
                etaMinima = listaDocenti[i].getEta();
                segna = i;
            }
        }
        System.out.println("L'età minore fra i docenti è : " + etaMinima);
        System.out.println(
                "Il docente in questione è : " + listaDocenti[segna].getNome() + listaDocenti[segna].getCognome());
    }
}

/*
 * * Scrivere poi una classe Università che rappresenti un insieme di docenti
 * universitari tramite un Array di tipo Docente e che contenga il costruttore,
 * i metodi accessori ed un metodo che restituisce l’età minima tra i docenti
 * universitari.
 */