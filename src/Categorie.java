public class Categorie
{
    private String nomCategorie;
    private long codeCategorie;

    public Categorie(long codeCategorie, String nomCategorie) {
        this.codeCategorie = codeCategorie;
        this.nomCategorie = nomCategorie;
    }

    public long getCodeCategorie()

    {
        return codeCategorie;
    }


    public void setCodeCategorie(long CodeCategorie)

    {
        this.codeCategorie = CodeCategorie;
    }


    public String getNomCategorie()

    {
        return nomCategorie;
    }


    public void setNomCategorie(String nomCategorie)

    {
        this.nomCategorie = nomCategorie;
    }

}