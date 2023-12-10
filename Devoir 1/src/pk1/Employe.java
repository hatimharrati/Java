package pk1;

public class Employe extends Personne {
    protected double salaire;

    public Employe(String nom, String prenom, String cni , int age, double salaire) {
		super(nom, prenom, cni, age);
		this.salaire = salaire;
	}
   
    @Override
    public String toString() {
        return super.toString() + ", Salaire : " + salaire;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Employe employe = (Employe) obj;
        return Double.compare(employe.salaire, salaire) == 0;
    }

    @Override
    public Employe clone() {
        return new Employe(this.getNom(), this.getPrenom(), this.getCni(), this.getAge(), this.salaire);
    }

	
}