package EX1;

public class Personne {
   public String CIN;
   public String nom;
   public String prenom;
   public String email;
   public int age =20;
    public Personne(){
    }
    public void initialiserpersonne(String CIN, String nom, String prenom, String email, int age) {
        this.CIN = CIN;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.age = age;
    }

    public void afficher(){
        System.out.println("cin="+CIN);
        System.out.println("Nom="+nom);
        System.out.println("Prenom="+prenom);
        System.out.println("Email="+email);
        System.out.println("age="+age);
    }
        public static void main(String[] args) {
            Personne Personne1 = new Personne();
            Personne1.initialiserpersonne("HH12342","Elkanich","Fatima","fatimaelkanich@gmail.com",21);
            Personne1.afficher();
        }}
