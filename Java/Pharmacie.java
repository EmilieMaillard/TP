import java.util.Scanner;

/** * Classe Pharmacie */
class Pharmacie { 
    // La classe Scanner est utilisée pour réaliser une entrée au clavier private
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        Client[] clients = new Client[2];
        Medicament[] medicaments = new Medicament[2];

        // Le constructeur prend 2 paramètres, le nom du client et son solde
        clients[0] = new Client("Karamazov", 0.0);
        clients[1] = new Client("Deray", 0.0);

        // Le constructeur prend 3 paramètres, le nom dumédicament, son prix
        // et son stock
        medicaments[0] = new Medicament("Transipeg", 20.40, 5);
        medicaments[1] = new Medicament("Effortil", 19.15, 5);

        int choix;

        do {
            choix = menu();

            switch (choix) {
                case 1:
                    achat(clients, medicaments);
                    break;
                case 2:
                    approvisionnement(medicaments);
                    break;
                case 3:
                    affichage(clients, medicaments);
                    break;
                case 4:
                    quitter();
            }
        } while (choix < 4);
    }

    // Les méthodes utilitaires

    static int menu() {
        int choix = 0;
        System.out.println();
        System.out.println();
        System.out.println("1 : Achat de médicament");
        System.out.println("2 : Approvisionnement en médicaments");
        System.out.println("3 : Etats des stocks et des crédits");
        System.out.println("4 : Quitter");
        while ((choix != 1) && (choix != 2) && (choix != 3) && (choix != 4)) {
            choix = scanner.nextInt();
        }
        return choix;
    }

    /** Option 1 
     * traite un achat de client (achat de médicament avec quantité donné)
     * le client paie un certain prix
     * opération pour déduire la quantité achetée du stock du médicament 
     * opération pour augmenter le crédit du client (montant équivalent au montant de l'achat moins la somme payée)
     * on doit lire les noms du client et du médicament 
     * le programme doit boucler jusqu'à introduire des noms connus de clients et médicaments
     * procédures vérification pris en charges par les méthodes clireClient et lireMedicament
     * quantité achetée et montant payé sont aussi lus depuis le terminal (et supposés correct)
    */
    static void achat(Client[] clients, Medicament[] medicaments){ //on passe en paramètre les objets Medicament et Client
        //on lit sur le terminal les clients et les médicaments
        Client unClient = lireClient(clients);
        Medicament unMedicament = lireMedicament(medicaments);
    }



    /** Option 2
     * approvisionner le stock d'un médicament
     * on doit lire sur le terminal le nom du médicament à approvisionner et la quantité à ajouter au stock
     * quand le nom est saisi, on vérifie bien qu'il existe dans la liste 
     * le programme boucle jusqu'à introduction d'un nom correct
     * procédure pris en charge par la méthode lireMedicament()
     */
    static void approvisionnement(Medicament[] medicaments){ //on passe en paramètre l'objet Medicament
        Medicament unMedicament = lireMedicament(medicaments); //on lit sur le terminal le nom du médicament à approvisionner et la quantité à ajouter au stock

        //on demande à l'utilisateur la quantité à approvisionner
        System.out.println("Quantité à ajouter : ");
        //on ajoute cette quantité à la variable qte 
        int qte = scanner.nextInt();
        // et on ajoute la quantite au medicament 
        unMedicament.ajoutMedocs(qte);

    }


    /** Option 3
     * affiche les clients et leurs crédits respectifs ainsi que les médicaments et leurs stocks respectifs
     */
    static void affichage(Client[] clients, Medicament[] medicaments){ //on passe en paramètre les objets Medicament et Client
        
        System.out.println("Liste des clients et leurs crédits respectifs : ");
        for(int i = 0; i < clients.length; i++){
            System.out.println("Le client " + clients[i].getNom() + " a un crédit de " + clients[i].getCredit() + " euros");
        }
        
        System.out.println("Liste des médicaments et leurs stocks respectifs : ");
        for(int i = 0; i < medicaments.length; i++){
            System.out.println("Le médicament " + medicaments[i].getNom() + " , a une quantité de " + medicaments[i].getStock() + " en stock");
        }
    }


    /** Option 4
     * Méthode qui affiche le message "Programme terminé !"
     */
    static void quitter(){
        System.out.println("Programme terminé !");
    }
}

static Medicament lireMedicament(Medicament[] medicaments){
    String nom;

    for (int i = 0; i < medicaments.length; i++)//pour chacun des éléments du tableaux médicaments
    {
      if(medicaments[i].equals(nom))//si le nom du médicament est égal à celui passé en paramètres
      {
        return medicaments[i];//on retourne le médicament en question
      }
    }

}

static Client lireClient(Client[] clients){
    String nom;

    for (int i = 0; i < clients.length; i++)//pour chacun des éléments du tableaux clients
    {
      if(clients[i].equals(nom))//si le nom du client est égal à celui passé en paramètres
      {
        return clients[i];//on retourne le client en question
      }
    }
}
