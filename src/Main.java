import java.util.ArrayList;

import Package.Student;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        // andiamo ora a stampare con un'iterazione tutta la lista attraverso un metodo

        if (list.isEmpty()) {
            System.out.println("La lista risulta essere vuota...");

        } else {

            for (Student listSt : list) {
                listSt.printInfo();

            }
        }

        // aggiungiamo 4 elementi alla collezione
        list.add(new Student("Antonio", 24));
        list.add(new Student("Franzisco", 29));
        list.add(new Student("Gennaflex", 23));

        for (Student listSt : list) {
            listSt.printInfo();

        }

    }

}

/*
 * Creare una classe Student che accenti nel costruttore il parametro name
 * (String e age Int)
 * 
 * In questa classe avere i metodi pubblici per ottenere le informazioni.
 * 
 * Creare un ArrayList con n elementi e stamparlo in console.
 * 
 * Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in
 * console
 * 
 */