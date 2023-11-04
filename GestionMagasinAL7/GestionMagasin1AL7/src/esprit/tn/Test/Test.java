package esprit.tn.Test;
import esprit.tn.Entite.Employe;
import esprit.tn.Entite.Vendeur;
import esprit.tn.Entite.Responsable;
import esprit.tn.Entite.Caissier;

import esprit.tn.Entite.Produit;
import esprit.tn.Gestion.Magasin;

import java.util.Date;

public class Test {

    public static void main(String[] args) {

        Magasin magasin1 = new Magasin(1, "Carrefour", "Centre-Ville");
        Magasin magasin2 = new Magasin(2, "Monoprix", "Menzah 6");
// Création des employés pour le premier magasin (magasin1)
        Caissier caissier1Magasin1 = new Caissier(1, "Caissier1", "Adresse1", 160);
        Vendeur vendeurMagasin1 = new Vendeur(2, "Vendeur1", "Adresse2", 160, 15.0); // Le taux de vente est de 15%
        Responsable responsableMagasin1 = new Responsable(3, "Responsable1", "Adresse3", 160, 500);

// Ajout des employés au premier magasin
        magasin1.ajouterEmploye(caissier1Magasin1);
        magasin1.ajouterEmploye(vendeurMagasin1);
        magasin1.ajouterEmploye(responsableMagasin1);

// Création des employés pour le deuxième magasin (magasin2)
        Caissier caissierMagasin2 = new Caissier(4, "Caissier2", "Adresse4", 180);
        Vendeur vendeur1Magasin2 = new Vendeur(5, "Vendeur1", "Adresse5", 160, 12.0); // Le taux de vente est de 12%
        Vendeur vendeur2Magasin2 = new Vendeur(6, "Vendeur2", "Adresse6", 160, 10.0); // Le taux de vente est de 10%
        Responsable responsableMagasin2 = new Responsable(7, "Responsable2", "Adresse7", 170, 600);

// Ajout des employés au deuxième magasin
        magasin2.ajouterEmploye(caissierMagasin2);
        magasin2.ajouterEmploye(vendeur1Magasin2);
        magasin2.ajouterEmploye(vendeur2Magasin2);
        magasin2.ajouterEmploye(responsableMagasin2);

        Produit p1=new Produit();


        System.out.println("id :"+p1.getIdentifiant());
        System.out.println("marque :"+p1.getMarque());

        System.out.println("libelle :"+p1.getLibelle());
        System.out.println("prix :"+p1.getPrix());

        Produit p2=new Produit(1021,"Delice","Lait");
        System.out.println("id :"+p2.getIdentifiant());
        System.out.println("marque :"+p2.getMarque());

        System.out.println("libelle :"+p2.getLibelle());
        System.out.println("prix :"+p2.getPrix());

        Produit p3=new Produit(2510,"Vitalait","Yaourt");
        Produit p4=new Produit(3250,"Sicam","Tomate",1.2f);

        p3.setPrix(-500);
        System.out.println("test de la méthode affiche");
    p2.afficher();
    p4.afficher();
        System.out.println("to String p2");
        System.out.println(p2.toString());
        System.out.println(p2);
        System.out.println("to String p3");
        System.out.println(p3.toString());
        System.out.println(p3);

        Date d1=new Date();

        p3.setDate_exp(d1);

        Produit p5=new Produit(1,"Delice","YAourt",d1);
        System.out.println("Après modification de date");
        p5.afficher();
        System.out.println(p5);
        System.out.println(p5.getDate_exp());


        System.out.println(p3);

        Magasin m1=new Magasin();

        Magasin m2=new Magasin(1,"ariana");

        m2.ajouter(p1);
        m2.ajouter(p2);

        m1.ajouter(p2);

        System.out.println("Total des produits"+Magasin.getTotalProduit());

        m2.ajouter(p3);
        System.out.println("Total des produits"+Magasin.getTotalProduit());


        m2.afficherLibellePr();

        m1.afficherLibellePr();


        System.out.println(p5.comparer(p2));


        System.out.println(Produit.comparer(p3,p5));


        m2.ajouter(p1);

        System.out.println(m1.plusProduit(m2));

        System.out.println(Magasin.plusProduit(m1,m2));
    }
}
