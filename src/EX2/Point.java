package EX2;
import java.util.Scanner;
public class Point {
    public String nom;
    public double abs;
    public Point(){};
    public void initialiser(String nom,double abs ){
        this.nom=nom;
        this.abs=abs;
    }
public static void main(String[]arg){
    Point point1 =new Point();
    point1.initialiser("A",2.5);
    System.out.println("point original :");
    point1.afficher();
    System.out.println("Donner la valeur de translation :");
    Scanner l=new Scanner(System.in);
    double t=l.nextDouble();
    System.out.println("le point après translation :");
    System.out.println("le point "+point1.nom+ " d'abssice "+point1.translater(t));
}
public void afficher(){
    System.out.println("le ponit "+nom+" d'abssice "+abs);}
    public double translater(double t){
        return (abs+t);
    }
}

