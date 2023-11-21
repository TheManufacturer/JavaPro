public class Corso {
    Studente[] listaStudenti;

    public Corso(Studente[] listaStudenti) {
        this.listaStudenti = listaStudenti;
    }


/*     public void metodoStudentiSuper(Studente[] listaStudenti, int soglia) {
        int conta = 0;
        for (int i = 0; i < listaStudenti.length; i++) {
            if (listaStudenti[i].getVoto() > soglia) {
                conta++;
            }
        }

        Studente[] listaStudenteSuperiore = new Studente[conta];

        for (int j = 0; j < conta; j++) {

            if (listaStudenti[j].getVoto() > soglia) {
                listaStudenteSuperiore[j] = listaStudenti[j];
            }
        }
        System.out.println("Studenti superiori alla soglia : ");

        for(int i=0; i< listaStudenteSuperiore.length; i++){

            System.out.println(listaStudenteSuperiore[i]);

        }
    } */

    public double metodoMediaStudenti(Studente[] listaStudenti) {
        double cont = 0;
        double somma = 0;
        for (int i = 0; i < listaStudenti.length; i++) {
            somma += listaStudenti[i].getVoto();
            cont++;
        }
        double media = somma / cont;
        return media;

    }
}

/*
 * Classe Corso:
 * 
 * Crea una classe Corso che rappresenti un insieme di studenti tramite un array
 * di tipo Studente.
 * 
 * La classe dovrebbe avere un costruttore che accetti un array di studenti.
 * Implementa un metodo che calcoli e restituisca la media dei voti degli
 * studenti nel corso.
 * 
 */