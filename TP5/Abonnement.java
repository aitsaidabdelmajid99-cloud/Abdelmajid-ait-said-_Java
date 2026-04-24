
abstract class Abonnement {
    private String nom;
    private double prixBase;
    private int nbProfils;

    // Constructeur
    
    public Abonnement(String nom, double prixBase, int nbProfils) {
        this.nom = nom;
        this.prixBase = (prixBase <= 0) ? 50 : prixBase; // valeur par défaut
        this.nbProfils = (nbProfils <= 0) ? 1 : nbProfils;
    }

    // Getters & Setters
    
    public String getNom() { return nom; }
    public double getPrixBase() { return prixBase; }
    public int getNbProfils() { return nbProfils; }

    public void setNom(String nom) { this.nom = nom; }
    public void setPrixBase(double prixBase) {
        if (prixBase > 0) this.prixBase = prixBase;
    }
    public void setNbProfils(int nbProfils) {
        if (nbProfils > 0) this.nbProfils = nbProfils;
    }

    // Méthode logique
    
    public boolean estPartageFamilial() {
        return nbProfils >= 3;
    }

    public void afficherInfos() {
        System.out.println("Nom: " + nom);
        System.out.println("Prix de base: " + prixBase);
        System.out.println("Nb profils: " + nbProfils);
        System.out.println("Partage familial: " + estPartageFamilial());
    }

    // Méthodes abstraites
    
    public abstract double calculerCoutMensuel();
    public abstract int calculerScoreSatisfaction();
}