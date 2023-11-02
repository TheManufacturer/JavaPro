import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println("Inserisci un indice ");

        int indice = scanner.nextInt();

        divisione(arr, indice);
        scanner.close();

    }

    private static void divisione(int[] array, int indice) {
        
        try{

        int denomin = 1;  //qui mettiamo [zero -->0] per causare l'errore,volendo possiamo gestire anche questo  

        int divisione = array[indice] / denomin;

        System.out.println(divisione);

        }catch(java.lang.ArithmeticException e){
            System.out.println("divisione per zero non fattibile");

        }catch( ArrayIndexOutOfBoundsException d){
            System.out.println("Indice non valido");

        }
    }
}

/*
 * Scrivere una funzione che accetti un array in input e provi a dividere un
 * numero dell'array per 0 e gestisca sia l'eccezione della divisione che quella
 * di indice non presente nell'array, leggendone il messaggio. Eseguire sempre
 * un blocco di codice scrivendo un messaggio in console.
 */
