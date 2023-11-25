public class Main{   
    public static void main(String[] args) {
        
        // Ottenere l'istanza unica di User
        User user1 = User.getInstance();
        user1.stampaInformazioni();

        // Ottenere nuovamente l'istanza unica di User
        User user2 = User.getInstance();

        // Cambio delle informazioni del secondo oggetto
        user2.setNome("Francesco");
        user2.setEta(25);

        // Stampare le informazioni del secondo oggetto
        user2.stampaInformazioni();
    }
}

/*
 * Crea una classe User che abbia i parametri privati nome ed età e i getter e setter.
 * 
 * All'interno di User ci sarà anche una funzione che stampi a video le
 * informazioni di età e il nome.
 * 
 * Creare 2 oggetti User di cui creerà un'istanza.
 * 
 * Del primo si stamperanno le informazioni di default, 
 * del secondo si cambieranno le informazioni e poi si stamperanno a video
 */