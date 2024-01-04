package pk;

public abstract class Employe {
    private String nom;
    private String prenom;
    private int age;
    private int anneeEntree;

    public Employe(String nom, String prenom, int age, int anneeEntree) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.anneeEntree = anneeEntree;
    }

	public abstract double calculerSalaire();

    public String getNom() {
        return getClass().getSimpleName() + " " + prenom + " " + nom;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age + ", Année d'entrée: " + anneeEntree;
    }
}

