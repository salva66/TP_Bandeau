package exemple;

import bandeau.Bandeau;

public class Teletype extends Effet {
    private String message;
    private int delay;

    public Teletype(Bandeau bandeau, String message, int delay) {
        super(bandeau);
        this.message = message;
        this.delay = delay;
    }

    @Override
    public void jouer() {
        bandeau.setMessage("");
        for (char c : message.toCharArray()) {
            bandeau.setMessage(bandeau.getMessage() + c);
            bandeau.sleep(delay);
        }
    }
}