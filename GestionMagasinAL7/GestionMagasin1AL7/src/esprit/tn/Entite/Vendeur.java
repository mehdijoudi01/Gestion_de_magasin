package esprit.tn.Entite;

public class Vendeur extends Employe {
    private double tauxDeVente;

    public Vendeur(int identifiant, String nom, String adresse, int nbr_heures, double tauxDeVente) {
        super(identifiant, nom, adresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }

    public double getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(double tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return super.toString() + ", Taux de Vente: " + tauxDeVente;
    }
    public double calculerSalaire() {
        double salaireFixe = 450.0;
        return salaireFixe * (tauxDeVente / 100);
    }
}