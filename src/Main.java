// import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {

        Product[] products = new Product[3];

        products[0] = new Product("Peraphone", "Peras", 1, 5);
        products[1] = new Product("Bananaphone", "Bananas", 2, 10);
        products[2] = new Product("Albiphone", "Albicocas", 3, 15);

        Product.printManifacturerFirstLetters(products);
        Product.calculateAverageQuantity(products);
    }

}

/*
 * È possibile implementare costruttori, setter, getter o qualsiasi altro metodo
 * aggiuntivo dove sia considerato necessario.
 * ---
 * Dichiarare una classe Product con le seguenti variabili di istanza:
 * name: String
 * manufacturer: String
 * id: long
 * quantity: int
 * 
 * ---
 * 
 * Implementare un metodo printManifacturerFirstLetters che prende
 * un array di oggetti Product come parametro e stampa sul terminale
 * la prima lettera dell'attributo manufacturer di ciascun elemento dell'array.
 * ---
 * 
 * Implementare un metodo principale in cui:
 * 
 * Viene allocato un array di 3 oggetti Product.
 * Viene chiamato il metodo printManifacturerFirstLetters passando l'array
 * allocato come parametro.
 * Viene stampato a schermo il valore medio dell'attributo quantity degli
 * elementi nell'array."
 * 
 */