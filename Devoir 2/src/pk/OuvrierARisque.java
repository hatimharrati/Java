package pk;

public class OuvrierARisque extends Ouvrier {
    private double prime;

    public OuvrierARisque(String nom, String prenom, int age, int anneeEntree, int uniteProduite, double prime) {
        super(nom, prenom, age, anneeEntree, uniteProduite);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + prime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Prime: " + prime;
    }
}
