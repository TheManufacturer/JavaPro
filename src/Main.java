import java.util.Scanner;
import java.util.InputMismatchException; //la usiamo per l'errore input 

public class Main {

    public static boolean isNumeroNelRange(int numero, int min, int max) {
        if (numero >= min && numero <= max) {
            return true;
        } else {
            throw new IllegalArgumentException("Il numero non è nel range da " + min + " a " + max);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        try {
            System.out.print("Inserisci un numero intero da controllare: ");
            int numero = scanner.nextInt();
            System.out.println("Hai inserito un numero intero: " + numero);
    
            System.out.print("Inserisci il limite superiore (max): ");
            int max = scanner.nextInt();
    
            System.out.print("Inserisci il limite inferiore (min): ");
            int min = scanner.nextInt();
    
            isNumeroNelRange(numero, min, max);
            System.out.println("Il numero --> " + numero + " è nel range da " + min + " a " + max);
    
        } catch (InputMismatchException e) {
            System.out.println("Errore: Non hai inserito un numero intero.");
            
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    
        scanner.close();
    }
    
}

/*
 * Scrivere una funzione che controlli se un numero int è in un determinato
 * range.
 * Se lo è ritorna true se non lo è lancia un'eccezione
 */