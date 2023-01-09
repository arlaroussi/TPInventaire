
public class Produit {

    //attributs
    private String codeProduit;
    private String nom;
    private int qte;
    private double prix;
    private int stock_sec;

    private Categorie categorie;

    //Manque de l'attribut Categorie
    public Produit(String codeProduit, String nom, int qte, double prix, int stock_secu, Categorie categorie) {
        this.codeProduit = codeProduit;
        this.nom = nom;
        this.qte = qte;
        this.prix = prix;
        this.stock_sec = stock_secu;
        this.categorie = categorie;
    }

    public Produit(String codeProduit, String nom, int qte) {
        this.codeProduit = codeProduit;
        this.nom = nom;
        this.qte = qte;
        this.prix = prix;
        this.stock_sec = stock_sec;
    }

    //approvisionnement
    
    public void setQtePlus(int qte)  {
        this.qte += qte;
    }
    //retour produit

    public void setQteMoins(int qte) {
        this.qte -= qte;
    }

    //recevoir la quantité

    public int getQte()
    {
        return qte;
    }

    //avertissement si le stockSecu est atteint

    public void securiteQte()
    {
        if (qte <= stock_sec)
            System.out.println("La quantité éxcède le stock de sécurité, réapprovisionnement nécessaire.");
    }
    //validation de la commande

    public boolean validation(int qte)
    {
        if(this.qte - qte < stock_sec)  //Condition erronée !!!
            return false;
        else
            return true;
    }
    //affichage de toute les données concernant un produit

    public void donneesProduit()   {
        System.out.println(codeProduit + " " + this.nom + " " + this.qte + " "+ this.prix + " " + " " + this.stock_sec + " " + this.categorie.getNomCategorie());
    }

}

//Absence de la classe traitement