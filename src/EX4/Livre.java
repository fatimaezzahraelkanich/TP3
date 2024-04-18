package EX4;

public class Livre {
    public String titre;
    public String auteur;
    public int nbp;
    public float prix;
    public boolean prixfixe = false;
    public Livre(String titre ,String auteur,int nbp){
        this.auteur=auteur;
        this.titre=titre;
        this.nbp=nbp;}
    public Livre(String titre ,String auteur,int nbp,float prix){
        this.auteur=auteur;
        this.titre=titre;
        this.nbp=nbp;
        this.prix=prix;}

    public java.lang.String getTitre() {
        return titre;}
    public java.lang.String getAuteur() {
        return auteur;}
    public int getNbp() {
        return nbp;}
    public float getPrix() {
        return prix;}
    public void setTitre(java.lang.String titre) {
        this.titre = titre;}
    public void setAuteur(java.lang.String auteur) {
        this.auteur = auteur;}
    public void setNbp(int nbp) {
        this.nbp = nbp;}
    public void setPrix(float prix) {
        this.prix = prix;}
    public String toString(){
        if (prix != -1){
            return titre + " est un livre ecrit par " + auteur + ". Il contient " +nbp+ " pages, et son prix est " + prix + "DH.";
        }
        else{
            return titre + " est un livre ecrit par " + auteur + ". Il contient " +nbp+ " pages.Le Prix pas encore donné";
        }
    }
    public void prixFixe(){
        if (prixfixe)
            System.out.println("Le prix de "+ titre + " ecrit par " + auteur+" est fixe. Prix: " + prix);
        else
            System.out.println("Le prix de "+ titre + " ecrit par " + auteur+ " n'est pas encore fixe!");
    }
    public int comparer(Livre livre){
        return Integer.compare(this.nbp, livre.nbp);
    }
}
