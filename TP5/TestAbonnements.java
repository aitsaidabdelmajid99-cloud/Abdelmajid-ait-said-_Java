
public class TestAbonnements {
    public static void main(String[] args) {

        Abonnement[] abonnements = {
            new AbonnementVideo("Netflix", 100, 4, true, true),
            new AbonnementMusique("Spotify", 50, 2, 25, true),
            new AbonnementJeux("GamePass", 80, 2, 60, 45)
        };

        // Parcours
        
        for (Abonnement a : abonnements) {
            a.afficherInfos();
            System.out.println("Cout: " + a.calculerCoutMensuel());
            System.out.println("Score: " + a.calculerScoreSatisfaction());
            System.out.println("----------------------");
        }

        // Reducible
        
        Reducible[] reducibles = {
            (Reducible) abonnements[0],
            (Reducible) abonnements[1]
        };

        for (Reducible r : reducibles) {
            System.out.println("Reduction 20%: " + r.appliquerReduction(20));
            System.out.println("Reduction 50%: " + r.appliquerReduction(50));
            System.out.println("----------------------");
        }
    }
}
