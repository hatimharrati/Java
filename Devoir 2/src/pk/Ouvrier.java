package pk;

public class Ouvrier extends Employe {
    private int uniteProduite;

    public Ouvrier(String nom, String prenom, int age, int anneeEntree, int uniteProduite) {
        super(nom, prenom, age, anneeEntree);
        this.uniteProduite = uniteProduite;
    }

    @Override
    public double calculerSalaire() {
        return uniteProduite * 5;
    }

    @Override
    public String toString() {
        return super.toString() + ", Unités produites: " + uniteProduite;
    }
}

