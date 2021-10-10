public class Client {
    
    //variables
    private String nom; 
    private double credit;

    //constructeur
    public Client(String nom, double credit){
        this.nom = nom;
        this.credit = credit;
    }

    //Méthodes get qui renvoie les valeurs des variables nom et credit
    public String getNom(){
        return nom;
    }

    public double getCredit(){
        return credit;
    }

    //méthode qui ajoute une somme a payer à la pharmacie
    public void ajoutCredit(double somme){
        credit += somme;
    }

    //méthode qui enleve une somme 
    public void enleveCredit(double somme){
        credit -= somme;
    }



}
