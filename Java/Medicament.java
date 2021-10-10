public class Medicament {

    //variables
    private String nom; 
    private double prix;
    private int stock;

    //constructeur
    public Medicament(String nom, double prix, int stock){
        this.nom = nom; 
        this.prix = prix;
        this.stock = stock;
    }

    //méthodes get qui renvoie les valeurs des variables nom, prix et stock
    public String getNom(){
        return nom;
    }

    public double getPrix(){
        return prix;
    }

    public int getStock(){
        return stock;
    }

    //méthode pour ajouter des médicaments au stock
    public void ajoutMedocs(int qte){
        stock += qte;
    }

    //méthode pour enlever des médicaments du stock
    public void enleverMedocs(int qte){
        stock -= qte;
    }
}
