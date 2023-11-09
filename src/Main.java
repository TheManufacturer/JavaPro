// import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Integer numeratore = null;
        Integer denominatore = null;

        try {
            checkNullFunction(numeratore, denominatore);
        } catch (NullPointerException e) {
            System.out.println("sembra tu non abbia inserito tutti i dati");
        }
    }

    public static void checkNullFunction(Integer numeratore, Integer denominatore) {
        if (numeratore == null || denominatore == null) {
            throw new NullPointerException();
        }
    }
}

/*
 * Scrivere una funzione che accetti in input un numeratore e un denominatore
 * Controlli che il numeratore e il denominatore non siano null
 * Usare la funzione appena scritta in due blocchi di codice dove si cattura
 * l'eventuale eccezione.
 */