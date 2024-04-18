package EX3;

import java.util.Scanner;

public class point {
        public String nom;
        public double abs;
        public point(String nom , double abs){
            this.abs=abs;
            this.nom=nom;
        };
        public static void main(String[]arg){
            point point1 = new point("A",9);
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


