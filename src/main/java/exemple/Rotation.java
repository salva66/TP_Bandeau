package exemple;

import bandeau.Bandeau;

public class Rotation extends Effet {
    private int repetitions;
    private int delay;

    public Rotation(Bandeau bandeau, int repetitions, int delay) {
        super(bandeau);
        this.repetitions = repetitions;
        this.delay = delay;
    }

    @Override
    public void jouer() {
        for (int i = 0; i < repetitions; i++) {
            for (double angle = 0; angle <= 2 * Math.PI; angle += Math.PI / 12) {
                bandeau.setRotation(angle);
                bandeau.sleep(delay);
            }
        }
    }
}