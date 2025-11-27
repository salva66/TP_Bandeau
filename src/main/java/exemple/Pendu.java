package exemple;

import bandeau.Bandeau;
import java.util.Random;

public class Pendu extends Effet {
    private String message;
    private int delay;

    public Pendu(Bandeau bandeau, String message, int delay) {
        super(bandeau);
        this.message = message;
        this.delay = delay;
    }

    @Override
    public void jouer() {
        int n = message.length();
        // On initialise l'affichage avec des tirets
        char[] display = new char[n];
        for (int i = 0; i < n; i++) {
            display[i] = '_';
        }
        bandeau.setMessage(new String(display));
        bandeau.sleep(delay);

        // On révèle les lettres aléatoirement
        boolean[] revealed = new boolean[n];
        int count = 0;
        Random rand = new Random();

        while (count < n) {
            int i = rand.nextInt(n);
            if (!revealed[i]) {
                display[i] = message.charAt(i);
                revealed[i] = true;
                count++;
                bandeau.setMessage(new String(display));
                bandeau.sleep(delay);
            }
        }
    }
}