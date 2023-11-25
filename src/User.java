public class User {
    private String nome;
    private int eta;

    // Istanza unica della classe User
    private static User instance;

    // Costruttore privato per evitare la creazione diretta di istanze
    private User() {

        // Informazioni di default
        this.nome = "Tony";
        this.eta = 35;
    }

    // Metodo per ottenere l'istanza unica della classe User

    public static User getInstance() {
        if (instance == null) {
            instance = new User();
        }
        return instance;
    }

    // Metodi Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    // Funzione per stampare le informazioni
    public void stampaInformazioni() {
        System.out.println("Nome: " + nome + ", Età: " + eta);
    }
}