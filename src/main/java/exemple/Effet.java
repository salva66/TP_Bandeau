package exemple;

import bandeau.Bandeau;

public abstract class Effet {
    protected Bandeau bandeau;

    public Effet(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    public abstract void jouer();
}