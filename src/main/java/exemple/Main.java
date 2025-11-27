package exemple;

import bandeau.Bandeau;

public class Main {
    public static void main(String[] args) {
        Bandeau monBandeau = new Bandeau();
        Scenario scenario = new Scenario(monBandeau);

        monBandeau.setMessage("Bonjour tout le monde !");
        scenario.ajouterEffet(new Clignotant(monBandeau, 3, 500));
        scenario.ajouterEffet(new Teletype(monBandeau, "Hello, World!", 200));
        scenario.ajouterEffet(new Clignotant(monBandeau, 5, 500));
        scenario.ajouterEffet(new Teletype(monBandeau, "On se prépare !", 200));
        scenario.ajouterEffet(new Rotation(monBandeau, 2, 100));
        scenario.ajouterEffet(new Teletype(monBandeau, "Voilà ! C'est terminé !", 200));
        monBandeau.sleep(500);

        scenario.jouer();
        monBandeau.close();
    }
}