package exercice;

public class Main {

    public static void main(String[] args) {
        TourComplet tc = new TourComplet();
        Clignoter c = new Clignoter();
        ChangerCouleur cc = new ChangerCouleur();
        DiscoBG disco = new DiscoBG();
        Zoom z = new Zoom();
        CaractereParCaractere cp = new CaractereParCaractere();


        Scenario scenario = new Scenario();
        scenario.ajouterEffet(c, 4);
        scenario.ajouterEffet(cc, 3);       
        //scenario.ajouterEffet(cp, 2);
        scenario.ajouterEffet(tc, 1);
        scenario.ajouterEffet(disco, 8);
        scenario.ajouterEffet(z, 1);

        scenario.excecuter();


    }


}