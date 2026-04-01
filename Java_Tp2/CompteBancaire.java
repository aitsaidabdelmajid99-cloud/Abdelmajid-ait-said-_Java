// Part 1_TP2
// Question 1
class CompteBancaire {
// Question 2
    private int numero;
    private String titulaire;
    private double solde;
    private double decouvertAutorise;
// Question 3
    private static int nbComptes = 0;
    private static double tauxInteretAnnuel = 0.03;

// Question 4
    public CompteBancaire() {
        this.numero = ++nbComptes;
        this.titulaire = "Inconnu";
        this.solde = 0;
        this.decouvertAutorise = 0;
    }

// Question 5
    public CompteBancaire(String titulaire, double solde, double decouvertAutorise) {
        this.numero = ++nbComptes;
        this.titulaire = titulaire;
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
    }

// Question 6
    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        if (titulaire != null && !titulaire.isEmpty()) {
            this.titulaire = titulaire;
        }
    }

    public void setDecouvertAutorise(double d) {
        if (d >= 0) {
            this.decouvertAutorise = d;
        }
    }

// Question 7
    
    public void afficher() {
        System.out.println("Compte #" + numero + " | Titulaire: " + titulaire +
                " | Solde: " + solde + " | Découvert: " + decouvertAutorise);
    }
// Question 8
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            System.out.println("Montant de dépôt invalide.");
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && solde - montant >= -decouvertAutorise) {
            solde -= montant;
        } else {
            System.out.println("Retrait refusé.");
        }
    }

    public void virementVers(CompteBancaire autre, double montant) {
        if (montant > 0 && solde - montant >= -decouvertAutorise) {
            this.retirer(montant);
            autre.deposer(montant);
        } else {
            System.out.println("Virement impossible : montant ou solde insuffisant.");
        }
    }
// Question 9
    public double calculerSoldeAvecInterets() {
        return solde + (solde * tauxInteretAnnuel);
    }

    public double calculerSoldeAvecInterets(double bonus) {
        return solde + (solde * (tauxInteretAnnuel + bonus));
    }
// Question 10
    public static int getNbComptes() {
        return nbComptes;
    }

    public static double getTauxInteretAnnuel() {
        return tauxInteretAnnuel;
    }

    public static void setTauxInteretAnnuel(double t) {
        tauxInteretAnnuel = t;
    }
   
}