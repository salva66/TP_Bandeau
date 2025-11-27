package exemple;

import bandeau.Bandeau;
import java.util.ArrayList;
import java.util.List;

public class Scenario {
    private List<Effet> effets;
    private Bandeau bandeau;

    public Scenario(Bandeau bandeau) {
        effets = new ArrayList<Effet>();
        this.bandeau = bandeau;
    }

    public void ajouterEffet(Effet effet) {
        effets.add(effet);
    }

    public void jouer() {
        for (Effet effet : effets) {
            effet.jouer();
        }
    }
}