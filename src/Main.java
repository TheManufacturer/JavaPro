import java.util.Scanner;
import java.util.InputMismatchException; //la usiamo per l'errore input 

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {       //inseriamo il blocco di codice all'interno del try
        
            System.out.print("Inserisci un numero intero: ");
            int numero = scanner.nextInt();
            System.out.println("Hai inserito un numero intero: " + numero);

        } catch (InputMismatchException e) {

            System.out.println("Errore: Non hai inserito un numero intero.");
            main(args);

        }

        scanner.close();
    }
}




/*
Scrivere una funzione che controlli se un numero int è in un determinato range.    
    Se lo è ritorna true se non lo è lancia un'eccezione
 */