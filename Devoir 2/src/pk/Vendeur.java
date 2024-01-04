package pk;

public class Vendeur extends Employe {
    private double chiffreAffaire;

    public Vendeur(String nom, String prenom, int age, int anneeEntree, double chiffreAffaire) {
        super(nom, prenom, age, anneeEntree);
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public double calculerSalaire() {
        return chiffreAffaire * 0.2 + 400;
    }

    @Override
    public String toString() {
        return super.toString() + ", Chiffre d'affaire: " + chiffreAffaire;
    }
}
