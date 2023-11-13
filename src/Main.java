import java.util.Scanner;
import java.util.ArrayList;

import Package.Student;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        // andiamo ora a stampare con un'iterazione tutta la lista attraverso un metodo

        if (list.isEmpty()) {
            System.out.println("La lista risulta essere vuota...");

        } else {

            for (Student listSt : list) {
                listSt.printInfo();

            }
        }

        // aggiungiamo n elementi elementi alla collezione

        System.out.println("Quanti elementi vuoi aggiungere alla tua <list> ?");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Che nome vuoi aggiungere...? ");
            String nome = scan.next();

            System.out.println("Inserisci l'età... ");
            int eta = scan.nextInt();

            list.add(new Student(nome, eta));

        }

        for (Student listSt : list) {
            listSt.printInfo();

        }
        System.out.println();

        // qui compariamo gli elementi della lista e stampiamo
        list.sort((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));
        
        for (Student listSt : list) {
            listSt.printInfo();

        }

        scan.close();

    }

}

/*
 * Creare una classe Student che accenti nel costruttore i parametri (String
 * name, int age)
 * 
 * In questa classe avere i metodi pubblici per ottenere le informazioni.
 * 
 * Creare un ArrayList con 12 elementi e stamparlo in console.
 * 
 * Mettere in ordine la collezione e stampare il risultato
 */