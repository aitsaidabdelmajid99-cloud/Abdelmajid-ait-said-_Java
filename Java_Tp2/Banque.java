// Part 2_TP2

// Question 1
class Banque {
    private String nom;
    private CompteBancaire[] comptes;
    private int nbActuels;
// Question 2
    public Banque(String nom, int capacite) {
        this.nom = nom;
        comptes = new CompteBancaire[capacite];
        nbActuels = 0;
    }
// Question 3
    public void ajouterCompte(CompteBancaire c) {
        if (nbActuels < comptes.length) {
            comptes[nbActuels++] = c;
        } else {
            System.out.println("Banque pleine !");
        }
    }

    public void afficherTous() {
        for (int i = 0; i < nbActuels; i++) {
            comptes[i].afficher();
        }
    }
}