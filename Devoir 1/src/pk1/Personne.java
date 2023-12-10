package pk1;

public class Personne implements Comparable<Personne> {
 protected String nom;
 protected String prenom;
 protected String cni;
 protected int age;

 public Personne(String nom, String prenom , String cni, int age) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.cni = cni;
	this.age = age;
}

 @Override
 public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", cni=" + cni + ", age=" + age + "]";
	}

 public String getNom() {
     return nom;
 }

 public void setNom(String nom) {
     this.nom = nom;
 }


 public String getPrenom() {
     return prenom;
 }

 public void setPrenom(String prenom) {
     this.prenom = prenom;
 }

 public String getCni() {
     return cni;
 }

 public void setCni(String cni) {
     this.cni = cni;
 }


 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }

 @Override
 public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Personne personne = (Personne) obj;
	    return  nom.equals(personne.nom) && prenom.equals(personne.prenom) && cni.equals(personne.cni) && age == personne.age;
	}


 @Override
 public Personne clone() {
     return new Personne(this.nom, this.prenom, this.cni, this.age);
 }

 @Override
 public int compareTo(Personne other) {
     return this.cni.compareTo(other.cni);
 }
}
