// Part 3_TP2

public class TestBanque {
    public static void main(String[] args) {
// Question 1
        Banque b = new Banque("MarocBank", 1500);
// Question 2
        CompteBancaire c1 = new CompteBancaire("Ali", 1000, 500);
        CompteBancaire c2 = new CompteBancaire("Sara", 2000, 300);
        CompteBancaire c3 = new CompteBancaire("Youssef", 1500, 400);
// Question 3
        b.ajouterCompte(c1);
        b.ajouterCompte(c2);
        b.ajouterCompte(c3);
// Question 4
        c1.deposer(500);
        c1.retirer(1200);
        c2.virementVers(c3, 500);
// Question 5
        b.afficherTous();
// Question 6
        System.out.println("Solde avec intérêts c2: " + c2.calculerSoldeAvecInterets());
        System.out.println("Solde avec bonus c2: " + c2.calculerSoldeAvecInterets(0.015));
// Question 7
        System.out.println("Nombre comptes: " + CompteBancaire.getNbComptes());
        System.out.println("Taux intérêt: " + CompteBancaire.getTauxInteretAnnuel());
    }
}