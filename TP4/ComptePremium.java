
public class ComptePremium extends Compte {
    private double plafondRetrait;

    public ComptePremium(String numero, String titulaire, double solde, double plafondRetrait) {
        super(numero, titulaire, solde);
        this.plafondRetrait = plafondRetrait;
    }

    @Override
    public void retirer(double montant) {
        if (montant > plafondRetrait) {
            System.out.println("Retrait refusé : dépasse le plafond !");
        } else if (solde >= montant) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant !");
        }
    }
}