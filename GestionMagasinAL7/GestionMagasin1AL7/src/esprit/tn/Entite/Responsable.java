package esprit.tn.Entite;

public class Responsable extends Employe {
    private double prime;

    public Responsable(int identifiant, String nom, String adresse, int nbr_heures, double prime) {
        super(identifiant, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Prime: " + prime;
    }
    public double calculerSalaire() {
        double tauxHoraire = 10.0; // Taux horaire normal
        int heuresTravaillees = getNbr_heures();
        double primeSalaire = prime;

        if (heuresTravaillees > 160) {
            primeSalaire += (heuresTravaillees - 160) * (tauxHoraire * 1.2);
            heuresTravaillees = 160;
        }

        return (tauxHoraire * heuresTravaillees) + primeSalaire;
    }
}