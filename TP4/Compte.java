public class Compte {
    protected String numero;
    protected String titulaire;
    protected double solde;

    // Constructeur
    
    public Compte(String numero, String titulaire, double solde) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = solde;
    }

    // Getters & Setters
    public String getNumero() { return numero; }
    public String getTitulaire() { return titulaire; }
    public double getSolde() { return solde; }

    public void setNumero(String numero) { this.numero = numero; }
    public void setTitulaire(String titulaire) { this.titulaire = titulaire; }
    public void setSolde(double solde) { this.solde = solde; }

    // Méthodes
    
    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) {
        if (solde >= montant) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant !");
        }
    }

    public void afficher() {
        System.out.println("Numéro: " + numero +
                           ", Titulaire: " + titulaire +
                           ", Solde: " + solde);
    }
}