import Package.Punto;

public class Main {
    public static void main(String[] args) {
        Punto punto1 = new Punto(1, 5);

        Punto punto2 = new Punto(6, 7);

        System.out.println("il record 1 : " + punto1);
        System.out.println("il record 2 : " + punto2);

        if (punto1.equals(punto2)) {
            System.out.println("Sono uguali");
        } else {
            System.out.println("Non sonn uguali. ");
        }
    }
}

/*
 * Definisci un oggetto Record che rappresenti un Punto con le coordinate x & y
 */