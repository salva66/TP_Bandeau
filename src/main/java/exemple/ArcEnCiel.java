package exemple;

import bandeau.Bandeau;
import java.awt.Color;

public class ArcEnCiel extends Effet {
    private int repetitions;
    private int delay;

    public ArcEnCiel(Bandeau bandeau, int repetitions, int delay) {
        super(bandeau);
        this.repetitions = repetitions;
        this.delay = delay;
    }

    @Override
    public void jouer() {
        Color originalColor = bandeau.getForeground();
        Color[] colors = {
                Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                Color.CYAN, Color.BLUE, new Color(148, 0, 211)
        };

        for (int i = 0; i < repetitions; i++) {
            for (Color c : colors) {
                bandeau.setForeground(c);
                bandeau.sleep(delay);
            }
        }
        bandeau.setForeground(originalColor);
    }
}