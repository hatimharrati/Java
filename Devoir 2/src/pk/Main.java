package pk;

public class Main {
	    public static void main(String[] args) {
	        Employe[] employes = new Employe[3];
	        employes[0] = new Vendeur("AAAAa", "aaaaa", 20, 2010, 5000);
	        employes[1] = new Ouvrier("BBBBB", "bbbbb", 25, 2015, 100);
	        employes[2] = new OuvrierARisque("CCCCC", "ccccc", 30, 2020, 200, 1000);

	        for (Employe employe : employes) {
	            System.out.println("Type: " + employe.getClass().getSimpleName() + ", Prénom et nom: " + employe.getNom());
	            System.out.println("Salaire: " + employe.calculerSalaire());
	        }
	}
}
