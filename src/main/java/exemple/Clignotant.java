package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Clignotant extends Effet {
    private int repetitions;
    private int delay;

    public Clignotant(Bandeau bandeau, int repetitions, int delay) {
        super(bandeau);
        this.repetitions = repetitions;
        this.delay = delay;
    }

    @Override
    public void jouer() {
        Color originalForeground = bandeau.getForeground();
        for (int i = 0; i < repetitions; i++) {
            bandeau.setForeground(Color.WHITE);
            bandeau.sleep(delay);
            bandeau.setForeground(originalForeground);
            bandeau.sleep(delay);
        }
    }
}