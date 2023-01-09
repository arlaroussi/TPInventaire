import java.util.ArrayList;

public class Traitement {

    public static void main(String[] args) {

        //Création de catégories
        Categorie c1 = new Categorie(10, "Informatique");
        Categorie c2 = new Categorie(20, "Téléphonie");
        Categorie c3 = new Categorie(30, "Eléctroménagers");

        //Création de produits
        Produit p1 = new Produit("INF1", "PC DELL", 200, 450, 50, c1);
        Produit p2 = new Produit("INF2", "PC ASUS", 300, 650, 30, c1);
        Produit p3 = new Produit("SAM10", "S22", 500, 900, 100, c2);

        p1.donneesProduit();
        p2.donneesProduit();

        ArrayList<Produit> liste = new ArrayList<Produit>();

        liste.add(new Produit("ELEC120", "FRIGO", 100, 650, 15, c3));
        liste.add(new Produit("INF2", "PC ASUS", 300, 650, 30, c1));
        liste.add(new Produit("INF2", "PC ASUS", 300, 650, 30, c1));

        for (Produit prod : liste) {
            prod.donneesProduit();
        }
    }
}
