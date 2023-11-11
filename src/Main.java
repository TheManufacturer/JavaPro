import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        funzioneHashSet(scan);

    }

    private static void funzioneHashSet(Scanner scan) {
        HashSet <String> set = new HashSet<>();
        System.out.println("Quanti elementi vuoi inserire? (Lavoriamo con le stringe)");
        int grandezza = Integer.parseInt(scan.next());
        
        for (int i = 0; i< grandezza; i++ ){

            System.out.println("Inserisci Stringa");
            set.add(scan.next());

        }

        System.out.println("La grandezza del nostro HashSet 'set' è : " + set.size() );
        System.out.println("Il nostro set contiene : " + set);
    }
}

/*
 * Scrivere una funzione che restituisca un hashset riempito
 * Leggere l'hashSet e stampre grandezza ed elementi
 */