package esprit.tn.Entite;

public class Caissier extends Employe {
    private int numeroDeCaisse;

    public Caissier(int identifiant, String nom, String adresse, int nbr_heures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de Caisse: " + numeroDeCaisse;
    }
    public double calculerSalaire() {
        double tauxHoraire = 5.0; // Taux horaire normal
        int heuresTravaillees = getNbr_heures();

        if (heuresTravaillees > 180) {
            heuresTravaillees = 180;
        }

        return tauxHoraire * heuresTravaillees;
    }
}