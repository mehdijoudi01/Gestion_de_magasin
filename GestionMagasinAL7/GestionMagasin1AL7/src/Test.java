import java.util.Date;

public class Test {

    public static void main(String[] args) {
        Produit p1=new Produit();


        System.out.println("id :"+p1.identifiant);
        System.out.println("marque :"+p1.marque);

        System.out.println("libelle :"+p1.libelle);
        System.out.println("prix :"+p1.prix);

        Produit p2=new Produit(1021,"Delice","Lait");
        System.out.println("id :"+p2.identifiant);
        System.out.println("marque :"+p2.marque);

        System.out.println("libelle :"+p2.libelle);
        System.out.println("prix :"+p2.prix);

        Produit p3=new Produit(2510,"Vitalait","Yaourt");
        Produit p4=new Produit(3250,"Sicam","Tomate",1.2f);

        p3.prix=0.5f;
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

        p3.date_exp=d1;

        Produit p5=new Produit(1,"Delice","YAourt",d1);
        System.out.println("Après modification de date");
        p5.afficher();
        System.out.println(p5);
        System.out.println(p5.date_exp);


        System.out.println(p3);
    }
}
