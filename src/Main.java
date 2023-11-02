import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {

                System.out.print("Inserisci un numero intero: ");
                int numero = scanner.nextInt();

                System.out.println("Hai inserito un numero intero: " + numero);
                break;

            } catch (InputMismatchException e) {

                System.out.println("Errore: Non hai inserito un numero intero. Riprova.");
                scanner.next();
            }
        }

        scanner.close();
    }
}

/*
 * 
 * Scrivere una funzione che controlli se un carattere è un numero altrimenti
 * lanciare una eccezione.
 * 
 */