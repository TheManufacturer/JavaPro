package Package;
public class Product {

    private String name;
    private String manufacturer;
    private long id;
    private int quantity;

    public Product(String name, String manufacturer, long id, int quantity) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.id = id;
        this.quantity = quantity;
    }

        // metodo stampa
    public static void printManifacturerFirstLetters(Product[] products) {

        for (Product prod : products) {

            String manufacturer = prod.getManufacturer();

            if (manufacturer != null && !manufacturer.isEmpty()) {

                char firstLetter = manufacturer.charAt(0);
                System.out.println("Prima lettera del produttore: " + firstLetter);

            }
        }
    }

        //metodo sulla media della quantità di Product
    public static void calculateAverageQuantity(Product[] products) {

        int totalQuantity = 0;

        for (Product prod : products) {

            totalQuantity += prod.getQuantity();
        }

        if (products.length > 0) {

            double averageQuantity = (double) totalQuantity / products.length;
            System.out.println("Valore medio della quantità: " + averageQuantity);

        } else {

            System.out.println("L'array è vuoto.");
        }
    }

    // Da qui in poi abbiamo Getter/Setter (x tutte le variabili)

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public long getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
