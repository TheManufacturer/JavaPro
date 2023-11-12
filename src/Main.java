import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        funzioneHashSet(scan);

    }

    private static void funzioneHashSet(Scanner scan) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Quanti elementi vuoi inserire? (Lavoriamo con Numeri)");
        int grandezza = Integer.parseInt(scan.next());

        //Qui popoliamo il nostro HashSet set...

        for (int i = 0; i < grandezza; i++) {

            System.out.println("Inserisci Stringa");
            set.add(Integer.parseInt(scan.next()));

        }

        //Qui controlliamo se all'interno si 'set' c'è un determinato elemento
        System.out.println("Inserisci il valore da controllare...");
        int numero = scan.nextInt();
        if (set.contains(numero)){
            System.out.println("il numero : " + numero +  " è contenuto nel set.");
        }else {
            System.out.println("L'elemento " + numero + " non è contenuto nel set ");
        }

        System.out.println("La grandezza del nostro HashSet 'set' è : " + set.size());
        System.out.println("Il nostro set contiene : " + set);
    }
}

/*
 * Scrivere una funzione che restituisca un HashSet riempito
 * Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
 * Verificare che l' elemento sia parte del Set e stampare il risultato
 */